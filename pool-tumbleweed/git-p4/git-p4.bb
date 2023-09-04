SUMMARY = "Git tools for importing Perforce repositories"
DESCRIPTION = "Tools for importing Perforce repositories to the GIT version control \
system."
LICENSE = "GPL-2.0-only"

PV = "2.41.0"

RPM_NAME = "git-p4-2.41.0-1.3.aarch64.rpm"
RPM_HASH = "b52774bd469ee1ea7537df65c98bef4a85733e44710056645c995e72ade0b6346304e6f1e92d69d891858deac2f8ef20a6186b5434aad70fd7970bc43bdf3c9f"

RPROVIDES:${PN} += "git-p4"

RDEPENDS:${PN} += "/usr/bin/python3 \
git-core"

inherit rpm
