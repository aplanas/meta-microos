SUMMARY = "Development files for libexmdbpp"
DESCRIPTION = "The library provides a C++ API and implementation for constructing \
exmdb protocol requests and responses and conversing with a server. \
 \
This subpackage contains the header files for the library."
LICENSE = "AGPL-3.0-or-later"

PV = "1.10.4.b7a36f2"

RPM_NAME = "libexmdbpp-devel-1.10.4.b7a36f2-1.2.aarch64.rpm"
RPM_HASH = "f194d7a3fa7768c066f1c1d823bdf0ada0b62fb2583dd006f703869da91a0bcc9bf48f52a0dd64c504ca8b894a66ad1ac1af7f2efa9d9699c66855d0f0ee67b0"

RPROVIDES:${PN} += "libexmdbpp-devel"

RDEPENDS:${PN} += "libexmdbpp0"

inherit rpm
