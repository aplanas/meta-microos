SUMMARY = "Macro Assembler AS"
DESCRIPTION = "AS is a portable macro cross-assembler for a variety of microprocessors \
and controllers. Although it is mainly targeted at embedded processors \
and single-board computers, you also find CPU families that are used in \
workstations and PCs in the target list."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "1.42_bld232"

RPM_NAME = "asl-1.42_bld232-1.4.aarch64.rpm"
RPM_HASH = "0d81124ea2b510abdcc0dc64b7d2b01d3b4a60c920966e021d7dfb6e98426ddd9545f7dfe31ada4fb0fed06ebcf96821f90cb24f6fc152e55e50ffbce4520e9e"

RPROVIDES:${PN} += "asl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
