SUMMARY = "Script Checking Engine Library for OpenSCAP"
DESCRIPTION = "This package contains the Script Checking Engine Library (SCE) for OpenSCAP."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.8"

RPM_NAME = "libopenscap_sce25-1.3.8-1.1.aarch64.rpm"
RPM_HASH = "d0c23cb2acb0eadbd0c33920f3fcbd73d11bb6138c814a0b622e3752651a154c96e12e350995689c2aed09804467c1cd74f80e2e1e93570006f3198fd9a9220f"

RPROVIDES:${PN} += "libopenscap-sce.so.25 \
libopenscap-sce25"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libopenscap.so.25 \
libpcre.so.1"

inherit rpm
