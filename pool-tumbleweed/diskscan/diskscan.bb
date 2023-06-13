SUMMARY = "Scan disk for bad or near failure sectors"
DESCRIPTION = "DiskScan is a Unix/Linux tool to scan a block device and check \
if there are unreadable sectors, in addition it uses read \
latency times as an assessment for a near failure as sectors \
that are problematic to read usually entail many retries. This \
can be used to assess the state of the disk and maybe decide \
on a replacement in advance to its imminent failure. The disk \
self test may or may not pick up on such clues depending on \
the disk vendor decision making logic."
LICENSE = "GPL-3.0-or-later"

PV = "0.20"

RPM_NAME = "diskscan-0.20-3.9.aarch64.rpm"
RPM_HASH = "0bfce2ad2b8019e27b49d3891b1c4d5458d6d20586697a45eb12e2f2dcaf36d21099bf0976dbab20afb4ea123b15dcaa1a556dfbc8cf0b4487d8a17a07164863"

RPROVIDES:${PN} += "diskscan \
diskscan(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libtinfo.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
