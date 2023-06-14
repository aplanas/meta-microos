SUMMARY = "Utility library for software from Belledonne Communications"
DESCRIPTION = "Utilities library used by Belledonne Communications softwares like \
belle-sip, mediastreamer2 and linphone. \
 \
This package the contains shared library for testing component."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.49"

RPM_NAME = "libbctoolbox-tester1-5.2.49-3.1.aarch64.rpm"
RPM_HASH = "8e80fadae9f65d71b4c4fc38f17808ed6302e647126c347fb12eef69e1ce056ad35cb28189ce97f3fa1d6ab1d582257ebf0cd8cf339240375ec9b3d0c15fe60e"

RPROVIDES:${PN} += "libbctoolbox-tester.so.1 \
libbctoolbox-tester1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libbctoolbox.so.1 \
libbcunit.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmbedcrypto.so.7 \
libstdc++.so.6"

inherit rpm
