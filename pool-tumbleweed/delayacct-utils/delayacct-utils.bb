SUMMARY = "Delay Accounting Utilities"
DESCRIPTION = "Delay accounting allows the administrator to track the time an \
application spends waiting on disk I/O, swap I/O and CPU scheduling. \
This can help pin-point resource shortages in a system configuration."
LICENSE = "GPL-2.0-only"

PV = "6.4.2"

RPM_NAME = "delayacct-utils-6.4.2-31.61.aarch64.rpm"
RPM_HASH = "9afd5a146049a036d0ab782e9be778f3c33ed99d186746f8f5bc0fdb2c24fa3612ceaeffe175c6c1f9accae499c61f2abfecf5eeff183c8f2662b0bf864928b6"

RPROVIDES:${PN} += "delayacct-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
