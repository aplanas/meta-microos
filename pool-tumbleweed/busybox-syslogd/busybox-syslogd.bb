SUMMARY = "Busybox applets providing syslogd"
DESCRIPTION = "This package contains the symlinks to provide syslogd with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-syslogd-1.36.1-28.1.noarch.rpm"
RPM_HASH = "e38f0ec896db26498348c66d9f28445d3eb5cc17e7f8f583e2a58f8f61ac2d544c31e1f021e5d1300000eb4fecf2e852ad8351ddbadd48a66f77919bb2ad4ba2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-syslogd"

RDEPENDS:${PN} += "busybox"

inherit rpm
