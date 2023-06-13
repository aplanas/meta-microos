SUMMARY = "Utility library for software from Belledonne Communications"
DESCRIPTION = "Utilities library used by Belledonne Communications softwares like \
belle-sip, mediastreamer2 and linphone. \
 \
This package the contains shared library."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.49"

RPM_NAME = "libbctoolbox1-5.2.49-3.1.aarch64.rpm"
RPM_HASH = "eb3f953e6a7670fa6e2cd962b10f78905b4e1858bf36282b06269e1b305510319b9046d5aeb29ae88cfc8a5b1051364dabd43e5d06a5338a35e00330a8f26182"

RPROVIDES:${PN} += "libbctoolbox.so.1()(64bit) \
libbctoolbox1 \
libbctoolbox1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libmbedcrypto.so.7()(64bit) \
libmbedtls.so.14()(64bit) \
libmbedx509.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
