SUMMARY = "Delay Accounting Utilities"
DESCRIPTION = "Delay accounting allows the administrator to track the time an \
application spends waiting on disk I/O, swap I/O and CPU scheduling. \
This can help pin-point resource shortages in a system configuration."
LICENSE = "GPL-2.0-only"

PV = "6.4.3"

RPM_NAME = "delayacct-utils-6.4.3-31.62.aarch64.rpm"
RPM_HASH = "00c37cbd4d6b917fb599c18a1311dfa374a803c5f51a808a10ac7b46d5b60448cefff1b3f0f0a2aec1269a1de615f0974a0fb6875300b42c19cc268a84b707ca"

RPROVIDES:${PN} += "delayacct-utils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
