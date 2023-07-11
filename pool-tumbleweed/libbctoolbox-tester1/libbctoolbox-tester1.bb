SUMMARY = "Utility library for software from Belledonne Communications"
DESCRIPTION = "Utilities library used by Belledonne Communications softwares like \
belle-sip, mediastreamer2 and linphone. \
 \
This package the contains shared library for testing component."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.73"

RPM_NAME = "libbctoolbox-tester1-5.2.73-1.1.aarch64.rpm"
RPM_HASH = "e7d8107ffeb385a24b82d612ce2f4f5235b3e72d551078dfe31c9603f2e068f09d60bee171add29d3c88c00cc3fb53b8e711f7be859720a387588c12b42a789e"

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
