SUMMARY = "Stand-alone obby server"
DESCRIPTION = "sobby is a stand-alone obby server. It currently runs under Unix-like \
platforms only."
LICENSE = "GPL-2.0+"

PV = "0.4.8"

RPM_NAME = "sobby-0.4.8-11.15.aarch64.rpm"
RPM_HASH = "d687ad0f5de9db6bdcc28ba8a56a8d845d1c282cc177f8f91fc9b9247c9808109f4bbf85afa9a96b934186d8a5041d60e8f63e2b663028ca409e41601a59e493"

RPROVIDES:${PN} += "sobby"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libavahi-glib.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libnet6-1.3.so.0 \
libobby-0.4.so.1 \
libsigc-2.0.so.0 \
libstdc++.so.6 \
libxml++-2.6.so.2"

inherit rpm
