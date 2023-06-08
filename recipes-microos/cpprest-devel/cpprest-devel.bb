SUMMARY = "Development files for cpprest"
DESCRIPTION = "The C++ REST SDK is a Microsoft project for cloud-based client-server \
communication in native code using a modern asynchronous C++ API design. This \
project aims to help C++ developers connect to and interact with services. \
 \
Development files."
LICENSE = "MIT & BSD-3-Clause & Zlib"

PV = "2.10.18"

RPM_NAME = "cpprest-devel-2.10.18-1.14.aarch64.rpm"
RPM_HASH = "3eb1dad982f36df269ce97302d036ffb13a3ec2d6f27c21cad73fe63943dcc75b7f8756f7f473972a3edf5550ac7ec0b8969beb60a4a1514b7985dabe1aae0ad"

RPROVIDES:${PN} += "cmake(cpprestsdk) cpprest-devel cpprest-devel(aarch-64) pkgconfig(cpprest)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libcpprest2_10"

inherit rpm
