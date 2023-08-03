SUMMARY = "CLI for accessing the zypper logfile"
DESCRIPTION = "CLI for accessing the zypper logfile"
LICENSE = "GPL-2.0-or-later"

PV = "1.14.62"

RPM_NAME = "zypper-log-1.14.62-1.1.noarch.rpm"
RPM_HASH = "803d283586b48895a3949bbc84b30c9e4e841f593236b206620a374a194da1eeeaa66d6dba243d51d915e359a37856727169cba44001f42107705167086774c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "zypper-log"

RDEPENDS:${PN} += "/usr/bin/awk \
/usr/bin/bash \
/usr/bin/grep"

inherit rpm
