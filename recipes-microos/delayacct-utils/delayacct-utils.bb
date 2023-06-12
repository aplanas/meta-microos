SUMMARY = "Delay Accounting Utilities"
DESCRIPTION = "Delay accounting allows the administrator to track the time an \
application spends waiting on disk I/O, swap I/O and CPU scheduling. \
This can help pin-point resource shortages in a system configuration."
LICENSE = "GPL-2.0-only"

PV = "6.3.4"

RPM_NAME = "delayacct-utils-6.3.4-31.57.aarch64.rpm"
RPM_HASH = "b1dcee8dc09a4f41130ef16e6a9e1de2c8b98847e36222279b54791c512fd690d951219c85f6b7ee8334d8ef5db0bca5e131c28c21980d1f7133f5767b279d51"

RPROVIDES:${PN} += "delayacct-utils \
delayacct-utils(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
