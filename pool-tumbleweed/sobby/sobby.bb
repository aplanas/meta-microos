SUMMARY = "Stand-alone obby server"
DESCRIPTION = "sobby is a stand-alone obby server. It currently runs under Unix-like \
platforms only."
LICENSE = "GPL-2.0+"

PV = "0.4.8"

RPM_NAME = "sobby-0.4.8-11.16.aarch64.rpm"
RPM_HASH = "9323ce0ae9cc6d9b3298dcdcf39938ff40b840757bcb0207680b20d83803af8715f6ec0309ecdc532ae1c580770f1c648af2943cfd2f9748e27facefd23d96b2"

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
