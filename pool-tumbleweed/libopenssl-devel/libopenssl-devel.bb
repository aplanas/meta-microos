SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "Apache-2.0"

PV = "3.1.1"

RPM_NAME = "libopenssl-devel-3.1.1-1.1.noarch.rpm"
RPM_HASH = "2986648b322f480bba9b13e91bc96230d91fe931380d01076be32b65c1c9e8cdd503f8f2a3035f8027c3b9a6d5155155e0f9aa2127778dd481a6dc01f995567c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libopenssl-devel \
openssl-devel \
pkgconfig(libcrypto) \
pkgconfig(libopenssl) \
pkgconfig(libssl) \
pkgconfig(openssl)"

RDEPENDS:${PN} += "libopenssl-3-devel \
libopenssl3 \
openssl \
pkgconfig"

inherit rpm
