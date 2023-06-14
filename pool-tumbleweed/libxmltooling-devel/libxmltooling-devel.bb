SUMMARY = "XMLTooling development Headers"
DESCRIPTION = "The XMLTooling library contains generic XML parsing and processing \
classes based on the Xerces-C DOM. It adds more powerful facilities \
for declaring element- and type-specific API and implementation \
classes to add value around the DOM, as well as signing and encryption \
support. \
 \
This package includes files needed for development with XMLTooling."
LICENSE = "Apache-2.0"

PV = "3.2.3"

RPM_NAME = "libxmltooling-devel-3.2.3-1.4.aarch64.rpm"
RPM_HASH = "f28c9c93c6d0a0eb1ee8e1b3c3d09195f0d022188cc8d12c0796ab987f2d33bec7cea4ca6bcaad9e33362f45cc2355b09812e4cb394965290e629b0915c022fc"

RPROVIDES:${PN} += "libxmltooling-devel \
pkgconfig-xmltooling \
pkgconfig-xmltooling-lite \
xmltooling-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
curl-devel \
libboost-headers-devel \
liblog4shib-devel \
libxerces-c-devel \
libxml-security-c-devel \
libxmltooling-lite10 \
libxmltooling10 \
openssl-devel \
pkgconfig-libcurl \
pkgconfig-log4shib \
pkgconfig-openssl \
pkgconfig-xerces-c \
pkgconfig-xml-security-c \
pkgconfig-zlib"

inherit rpm
