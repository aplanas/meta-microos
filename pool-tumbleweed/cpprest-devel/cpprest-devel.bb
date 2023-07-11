SUMMARY = "Development files for cpprest"
DESCRIPTION = "The C++ REST SDK is a Microsoft project for cloud-based client-server \
communication in native code using a modern asynchronous C++ API design. This \
project aims to help C++ developers connect to and interact with services. \
 \
Development files."
LICENSE = "MIT & BSD-3-Clause & Zlib"

PV = "2.10.18"

RPM_NAME = "cpprest-devel-2.10.18-1.15.aarch64.rpm"
RPM_HASH = "4af9e516351114b6862f9159be5d2efb8aec027f0d67484587295b78fb109082fa560848b8af1c23a641e2fe4007809111ed4e9fb52a298a692d7dd0d5ff526a"

RPROVIDES:${PN} += "cmake-cpprestsdk \
cpprest-devel \
pkgconfig-cpprest"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcpprest2-10"

inherit rpm
