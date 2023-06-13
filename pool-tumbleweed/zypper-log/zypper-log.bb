SUMMARY = "CLI for accessing the zypper logfile"
DESCRIPTION = "CLI for accessing the zypper logfile"
LICENSE = "GPL-2.0+"

PV = "1.14.60"

RPM_NAME = "zypper-log-1.14.60-1.1.noarch.rpm"
RPM_HASH = "2d490bbe1dc85d3003018d3c2b7054c87698af4ff0d32e9114da945acbe3a8738925d7d312f4f761734fcaf1bc0620dea23d830ad4de560d8404511fd300143f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "zypper-log"

RDEPENDS:${PN} += "/bin/bash \
/usr/bin/awk \
/usr/bin/grep"

inherit rpm
