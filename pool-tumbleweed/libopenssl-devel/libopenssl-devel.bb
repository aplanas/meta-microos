SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "Apache-2.0"

PV = "3.1.2"

RPM_NAME = "libopenssl-devel-3.1.2-1.1.noarch.rpm"
RPM_HASH = "bdda55115d0ee67331473b3843dc0c7722a79f85288c26f27eb93c6e8f9474a6324dafe5cc5ca79f8efaf42f5049228c78b3cbfa12c5c7e288a456c583101c1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libopenssl-devel \
openssl-devel \
pkgconfig-libcrypto \
pkgconfig-libopenssl \
pkgconfig-libssl \
pkgconfig-openssl"

RDEPENDS:${PN} += "libopenssl-3-devel \
libopenssl3 \
openssl \
pkgconfig"

inherit rpm
