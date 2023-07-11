SUMMARY = "Busybox applets providing syslogd"
DESCRIPTION = "This package contains the symlinks to provide syslogd with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-syslogd-1.36.1-27.1.noarch.rpm"
RPM_HASH = "14492d1b15f3dd1f7b1d63cd45298f1a5e080230e93fe90950b7039de153d004e51f1c87cbabda6144ad8c9e05fc49291e4af3c8002f1dc4382faa1588d65c04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-syslogd"

RDEPENDS:${PN} += "busybox"

inherit rpm
