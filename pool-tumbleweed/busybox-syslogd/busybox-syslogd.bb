SUMMARY = "Busybox applets providing syslogd"
DESCRIPTION = "This package contains the symlinks to provide syslogd with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-syslogd-1.36.1-30.1.noarch.rpm"
RPM_HASH = "0dfd21dd57e82f8005d9ce0c8acf4339dcafbbd99f894370bd4af7871617ff68cbb9e71ac6602f288f2abff85808d79c54eb04a5e8a0be7916e0518b18a725e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-syslogd"

RDEPENDS:${PN} += "busybox"

inherit rpm
