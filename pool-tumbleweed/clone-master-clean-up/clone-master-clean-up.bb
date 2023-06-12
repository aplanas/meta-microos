SUMMARY = "Tool to clean up a system for cloning preparation"
DESCRIPTION = "A tool to clean up a system for cloning preparation by cleaning up \
usage history and log files, etc."
LICENSE = "GPL-2.0-or-later"

PV = "1.11"

RPM_NAME = "clone-master-clean-up-1.11-1.1.noarch.rpm"
RPM_HASH = "f5939b0a546296444c64e5aaaeb419e71e3f088a81635304c6281b8c40ea139ac5991931b1a81f59b2dd1027ac2bc50da9e789922cb44812dde9896f455bcb7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clone-master-clean-up \
config(clone-master-clean-up)"
RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
coreutils \
curl \
fillup \
sed \
systemd"

inherit rpm
