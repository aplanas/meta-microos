SUMMARY = "Delay Accounting Utilities"
DESCRIPTION = "Delay accounting allows the administrator to track the time an \
application spends waiting on disk I/O, swap I/O and CPU scheduling. \
This can help pin-point resource shortages in a system configuration."
LICENSE = "GPL-2.0-only"

PV = "6.4.12"

RPM_NAME = "delayacct-utils-6.4.12-31.68.aarch64.rpm"
RPM_HASH = "2965bde6f649471e3e031f082f88cdbb89fe2d5a2d80cba095c08fedc85ecaa0d4505d8af5dae2a0c0edc1c6a9334abb836d8eae8c623ed7d728c78adab38bbb"

RPROVIDES:${PN} += "delayacct-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
