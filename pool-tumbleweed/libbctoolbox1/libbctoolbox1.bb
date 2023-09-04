SUMMARY = "Utility library for software from Belledonne Communications"
DESCRIPTION = "Utilities library used by Belledonne Communications softwares like \
belle-sip, mediastreamer2 and linphone. \
 \
This package the contains shared library."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.98"

RPM_NAME = "libbctoolbox1-5.2.98-1.1.aarch64.rpm"
RPM_HASH = "ed13d1e1d6d6fc6d60dd3f31238a939e3274ed9da7a56362e8909b79e834327bb70bb4317b0a52d454be303b22c6238235ae3fcfa6fb36930a39e09150a52fd4"

RPROVIDES:${PN} += "libbctoolbox.so.1 \
libbctoolbox1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libmbedcrypto.so.7 \
libmbedtls.so.14 \
libmbedx509.so.1 \
libstdc++.so.6"

inherit rpm
