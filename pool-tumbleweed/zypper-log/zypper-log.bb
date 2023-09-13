SUMMARY = "CLI for accessing the zypper logfile"
DESCRIPTION = "CLI for accessing the zypper logfile"
LICENSE = "GPL-2.0-or-later"

PV = "1.14.64"

RPM_NAME = "zypper-log-1.14.64-1.1.noarch.rpm"
RPM_HASH = "46fabb99f0daa5c6c48938db2e72e74d1a16bb7b260e73c5c23fca7a888105f09b983389d2e7cbfc2278050b8c6101aae52a78f040102ecc8311e6548b71d2f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "zypper-log"

RDEPENDS:${PN} += "/usr/bin/awk \
/usr/bin/bash \
/usr/bin/grep"

inherit rpm
