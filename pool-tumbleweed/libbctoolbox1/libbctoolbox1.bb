SUMMARY = "Utility library for software from Belledonne Communications"
DESCRIPTION = "Utilities library used by Belledonne Communications softwares like \
belle-sip, mediastreamer2 and linphone. \
 \
This package the contains shared library."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.73"

RPM_NAME = "libbctoolbox1-5.2.73-1.1.aarch64.rpm"
RPM_HASH = "cf8002b23e61828b3c0f3c1a7548569453683097526b7111113ff4d1e0a3b3ca3b9596c624e4d16d64d390bdfe438daed3c577079b37d2933957563f2be75f08"

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
