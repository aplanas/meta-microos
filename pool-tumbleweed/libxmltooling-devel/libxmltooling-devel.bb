SUMMARY = "XMLTooling development Headers"
DESCRIPTION = "The XMLTooling library contains generic XML parsing and processing \
classes based on the Xerces-C DOM. It adds more powerful facilities \
for declaring element- and type-specific API and implementation \
classes to add value around the DOM, as well as signing and encryption \
support. \
 \
This package includes files needed for development with XMLTooling."
LICENSE = "Apache-2.0"

PV = "3.2.4"

RPM_NAME = "libxmltooling-devel-3.2.4-1.1.aarch64.rpm"
RPM_HASH = "421ffe1fe27a45db9072ce075e311e3000ff6ef4f8e107eccf4bd9dbf02001ac11576e7276edf595a61aff57b107f077fb3e1e1b6fb05a59f01012db1bdb99ef"

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
