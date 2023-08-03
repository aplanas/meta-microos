SUMMARY = "Delay Accounting Utilities"
DESCRIPTION = "Delay accounting allows the administrator to track the time an \
application spends waiting on disk I/O, swap I/O and CPU scheduling. \
This can help pin-point resource shortages in a system configuration."
LICENSE = "GPL-2.0-only"

PV = "6.4.6"

RPM_NAME = "delayacct-utils-6.4.6-31.64.aarch64.rpm"
RPM_HASH = "5c5316c5d5b3a18b36b283b259e5171277f220c2b7ae1b8cca4d5a5653321215b7bdd36e12d66c9d1add44af6739f4b0a8b3cce7ec765b46ee78aebe29fac527"

RPROVIDES:${PN} += "delayacct-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
