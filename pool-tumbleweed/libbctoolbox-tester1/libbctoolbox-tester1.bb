SUMMARY = "Utility library for software from Belledonne Communications"
DESCRIPTION = "Utilities library used by Belledonne Communications softwares like \
belle-sip, mediastreamer2 and linphone. \
 \
This package the contains shared library for testing component."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.98"

RPM_NAME = "libbctoolbox-tester1-5.2.98-1.1.aarch64.rpm"
RPM_HASH = "136519cde7d027ed844fad6f593e7ecda563fe9bac5b61840b2dd6bce4345de500c426e9d6eca97af36a2b061c0f55a4a06a09d2741d2c84a2155b9b42c714b6"

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
