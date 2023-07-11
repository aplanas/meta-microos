SUMMARY = "Delay Accounting Utilities"
DESCRIPTION = "Delay accounting allows the administrator to track the time an \
application spends waiting on disk I/O, swap I/O and CPU scheduling. \
This can help pin-point resource shortages in a system configuration."
LICENSE = "GPL-2.0-only"

PV = "6.3.9"

RPM_NAME = "delayacct-utils-6.3.9-31.60.aarch64.rpm"
RPM_HASH = "526582e005f5ccf91d6f25782ba9280c36e20139ee9cfa282bef0c58854c667c9f7ae9f30df92ec27248d61ef15c9848eb36d182c0645cf90b710af55341ce12"

RPROVIDES:${PN} += "delayacct-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
