SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "Apache-2.0"

PV = "3.1.1"

RPM_NAME = "libopenssl-devel-3.1.1-2.1.noarch.rpm"
RPM_HASH = "1f53cd7245089ea8bd2270d8aefde452d6024e9ecb74b55e8e40f0aaa94466669cb7108f59c9e5ecb4d747d2af7407ab715f4e9f706c67e6b06ae1fdcfadb674"
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
