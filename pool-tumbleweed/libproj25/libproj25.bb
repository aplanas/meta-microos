SUMMARY = "Cartographic projection software"
DESCRIPTION = "This package the library for performing respective \
forward and inverse transformation of cartographic data to or from cartesian \
data with a wide range of selectable projection functions."
LICENSE = "MIT"

PV = "9.2.0"

RPM_NAME = "libproj25-9.2.0-1.3.aarch64.rpm"
RPM_HASH = "69179bc475c3f7f80f8c03605324c085e08fe82b3a0df8288557e60755feb7beee1155dd69de324b8552a9842018eb3d578dd23693471e78f54ce3149e3cede3"

RPROVIDES:${PN} += "libproj.so.25()(64bit) \
libproj25 \
libproj25(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcurl.so.4()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libsqlite3.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libtiff.so.6()(64bit)"

inherit rpm
