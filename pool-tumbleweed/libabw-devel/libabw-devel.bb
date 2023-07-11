SUMMARY = "Files for Developing with libabw"
DESCRIPTION = "Libabw is library providing ability to interpret and import AbiWord documents \
into various applications. \
 \
This package contains the libabw development files."
LICENSE = "MPL-2.0"

PV = "0.1.3"

RPM_NAME = "libabw-devel-0.1.3-1.19.aarch64.rpm"
RPM_HASH = "d5310dc4d54f5261b988e6fd9ba89888cfef7b233d21b3de4afc3a7d23032aa8f650b573d30fc633a2b7dd25954795ebf7587b419f6f23ba52537d490fac9510"

RPROVIDES:${PN} += "libabw-devel \
pkgconfig-libabw-0.1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libabw-0-1-1 \
pkgconfig-librevenge-0.0 \
pkgconfig-librevenge-stream-0.0 \
pkgconfig-libxml-2.0 \
pkgconfig-zlib"

inherit rpm
