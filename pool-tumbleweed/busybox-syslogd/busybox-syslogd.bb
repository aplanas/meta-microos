SUMMARY = "Busybox applets providing syslogd"
DESCRIPTION = "This package contains the symlinks to provide syslogd with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-syslogd-1.36.1-29.1.noarch.rpm"
RPM_HASH = "239735205df343b70d9b1e103f3796330bcff0b7de08b6b17b4990c5a175d89635e651083c3810ad8a858b4c2edf2cece58209836c6dbb2fd0ccaa893f541ff9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-syslogd"

RDEPENDS:${PN} += "busybox"

inherit rpm
