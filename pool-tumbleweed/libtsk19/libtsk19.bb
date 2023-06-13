SUMMARY = "Library for file system and volume forensic analysis"
DESCRIPTION = "The libtsk19 package contains library for sleuthkit. \
 \
The name of the library was changed from libtsk3 to libtsk"
LICENSE = "CPL-1.0 & IPL-1.0 & GPL-2.0-or-later"

PV = "4.12.0"

RPM_NAME = "libtsk19-4.12.0-1.3.aarch64.rpm"
RPM_HASH = "2ef4e7fd6c2a61c50636228afc74142b30d5e10d77f5e4c0df2359d157000038cc25a5632d5af4248f339ebd425a4e3a65075ab2dbba130342f9904c3cd8f135"

RPROVIDES:${PN} += "libtsk.so.19()(64bit) \
libtsk19 \
libtsk19(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libbfio.so.1()(64bit) \
libbfio.so.1(V_20221025)(64bit) \
libc.so.6()(64bit) \
libewf.so.3()(64bit) \
libewf.so.3(V_20230212)(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
