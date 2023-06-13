SUMMARY = "Program Showing the Status of LSI 1030 RAID Controller"
DESCRIPTION = "This program shows the status of the physical and logical drives attached \
to a LSI 1030 RAID (mptlinux, fusion, mpt, ioc) controller."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.0"

RPM_NAME = "mpt-status-1.2.0-194.12.aarch64.rpm"
RPM_HASH = "04b91993b68d2ba2c04be5dc089bf316003f040eca06b3b7e29a9551912b09000035a4e0fea355b0fdea4b3dbdcd944bf17826a2314ab5db0b2afec6573bdf5b"

RPROVIDES:${PN} += "mpt-status \
mpt-status(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
