SUMMARY = "A multilingual input method framework"
DESCRIPTION = "Uim is a multilingual input method framework."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & (BSD-3-Clause | LGPL-2.0-only)"

PV = "1.8.8"

RPM_NAME = "uim-1.8.8-9.9.aarch64.rpm"
RPM_HASH = "06dbc336846b6d1cb0d109fc96254d203e35ee18563bb8990fee64c5ffe16ca5a4183f45d74bc5b5e429d9cb711caee1837e3729a1f9742335fc1c9416e83b36"

RPROVIDES:${PN} += "application() \
application(uim.desktop) \
libgcroots.so.0()(64bit) \
libuim-anthy-utf8.so()(64bit) \
libuim-anthy.so()(64bit) \
libuim-custom-enabler.so()(64bit) \
libuim-custom.so.2()(64bit) \
libuim-editline.so()(64bit) \
libuim-fileio.so()(64bit) \
libuim-lolevel.so()(64bit) \
libuim-look.so()(64bit) \
libuim-m17nlib.so()(64bit) \
libuim-process.so()(64bit) \
libuim-scm.so.0()(64bit) \
libuim-skk.so()(64bit) \
libuim-socket.so()(64bit) \
libuim-xkb.so()(64bit) \
libuim.so.8()(64bit) \
uim \
uim(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
/usr/bin/touch \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXext.so.6()(64bit) \
libXft.so.2()(64bit) \
libanthy.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libedit.so.0()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm17n-core.so.0()(64bit) \
libm17n.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit)"

inherit rpm
