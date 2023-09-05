SUMMARY = "Git tools for importing Perforce repositories"
DESCRIPTION = "Tools for importing Perforce repositories to the GIT version control \
system."
LICENSE = "GPL-2.0-only"

PV = "2.42.0"

RPM_NAME = "git-p4-2.42.0-1.1.aarch64.rpm"
RPM_HASH = "e368366d78fa7fa50a05634b68e7ea84cc2be2c8b0ab744b6da71d064158237812e0586b93df974687109629084379ed9ee38cf6685b7bade85143f210e38c3e"

RPROVIDES:${PN} += "git-p4"

RDEPENDS:${PN} += "/usr/bin/python3 \
git-core"

inherit rpm
