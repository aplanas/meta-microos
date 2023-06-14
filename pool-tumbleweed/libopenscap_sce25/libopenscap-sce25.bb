SUMMARY = "Script Checking Engine Library for OpenSCAP"
DESCRIPTION = "This package contains the Script Checking Engine Library (SCE) for OpenSCAP."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.7"

RPM_NAME = "libopenscap_sce25-1.3.7-1.1.aarch64.rpm"
RPM_HASH = "893c1e4b23f9c43f3de5329e2a82ad5ca6b731fdd42da5a3aaf7f7400b3f29ffc3fe836a0137a51508480080cedc9a150a0defa1c2c2f2fbc800af61c268813d"

RPROVIDES:${PN} += "libopenscap-sce.so.25 \
libopenscap-sce25"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libopenscap.so.25 \
libpcre.so.1"

inherit rpm
