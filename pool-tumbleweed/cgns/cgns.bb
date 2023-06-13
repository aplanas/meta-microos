SUMMARY = "CFD General Notation System"
DESCRIPTION = "The CFD General Notation System (CGNS) provides a general, portable, \
and extensible standard for the storage and retrieval of computational \
fluid dynamics (CFD) analysis data."
LICENSE = "Zlib"

PV = "4.3.0"

RPM_NAME = "cgns-4.3.0-1.7.aarch64.rpm"
RPM_HASH = "fb7f802633e25044c402fdba9aa944b28c4e22a4923111e3a8b895fe49622985c3be0dd1801a20563353d6af833c2dca403f400e7c3a33c9992d47c031199190"

RPROVIDES:${PN} += "cgns \
cgns(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcgns.so.4.3()(64bit)"

inherit rpm
