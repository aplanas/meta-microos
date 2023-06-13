SUMMARY = "Library to import QuarkXPress documents"
DESCRIPTION = "libqxp is library providing ability to interpret and import QuarkXPress \
document formats into various applications. Currently it only supports \
QuarkXPress 3.1-4.1."
LICENSE = "MPL-2.0"

PV = "0.0.2"

RPM_NAME = "libqxp-0_0-0-0.0.2-1.20.aarch64.rpm"
RPM_HASH = "25d5f9145bd0dfb00d1aaf4cdc024d3aa70615e092836b024015a64f057387bba2d79bd8079655c48e6fd014cd7b3c5917f9da8dfdd0f3ff8174e3ae5fd116ac"

RPROVIDES:${PN} += "libqxp-0.0.so.0()(64bit) \
libqxp-0_0-0 \
libqxp-0_0-0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libicuuc.so.73()(64bit) \
libm.so.6()(64bit) \
librevenge-0.0.so.0()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
