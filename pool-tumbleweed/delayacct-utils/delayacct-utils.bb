SUMMARY = "Delay Accounting Utilities"
DESCRIPTION = "Delay accounting allows the administrator to track the time an \
application spends waiting on disk I/O, swap I/O and CPU scheduling. \
This can help pin-point resource shortages in a system configuration."
LICENSE = "GPL-2.0-only"

PV = "6.4.11"

RPM_NAME = "delayacct-utils-6.4.11-31.67.aarch64.rpm"
RPM_HASH = "55759e533d5d994e1ca3b759ee2c34a73547a637eb6c1d4ca2fac2617404e9ebc3543f31faf51d623fde49a6f8b807988748add1a3f1f6545b903e881190d86f"

RPROVIDES:${PN} += "delayacct-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
