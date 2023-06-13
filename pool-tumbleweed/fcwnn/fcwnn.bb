SUMMARY = "Free cWnn Chinese Input System (Mainland China)"
DESCRIPTION = "Free cWnn Chinese Input System (mainland China)."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.1a023.1"

RPM_NAME = "fcwnn-1.1.1a023.1-4.3.aarch64.rpm"
RPM_HASH = "ca40627a98b0e84d4a6a54b106ce2edb6ed2d526e24196ea9410b36b638854e69dfee2ff1a328671c1b6641a2dca8261e0e1c64c3a22827c0c17e1d32813674a"

RPROVIDES:${PN} += "config(fcwnn) \
fcwnn \
fcwnn(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
fcwnncom \
fkwnn \
fwnn \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypt.so.1()(64bit) \
libwrap.so.0()(64bit) \
shadow"

inherit rpm
