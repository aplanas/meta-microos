SUMMARY = "Macro Assembler AS"
DESCRIPTION = "AS is a portable macro cross-assembler for a variety of microprocessors \
and controllers. Although it is mainly targeted at embedded processors \
and single-board computers, you also find CPU families that are used in \
workstations and PCs in the target list."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "1.42_bld232"

RPM_NAME = "asl-1.42_bld232-1.3.aarch64.rpm"
RPM_HASH = "2015a662b2cb8299914aa8250a3db7ed23771c8de5d9d6bb350ce6d23ddbf88f883544110656e594255d9329b1eb2ef799db6286d27771f9f220877c4b5bcddc"

RPROVIDES:${PN} += "asl asl(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
