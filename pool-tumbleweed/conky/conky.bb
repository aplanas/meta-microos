SUMMARY = "A System Monitor"
DESCRIPTION = "Conky is an configurable system monitor."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later & MIT"

PV = "1.13.1"

RPM_NAME = "conky-1.13.1-3.1.aarch64.rpm"
RPM_HASH = "34fc88d4fbf28f1635c0cae2a468e0d583bedb7c887b1f63cea1a4943ce797b80e0bcf997e226d16e34341215742be818d923cc01b0e88945ecc59a74e6bc9f3"

RPROVIDES:${PN} += "application() \
application(conky.desktop) \
config(conky) \
conky \
conky(aarch-64) \
conky-cairo \
conky-feature-nvidia \
conky-imlib2 \
libcairo.so()(64bit) \
libcairo_imlib2_helper.so()(64bit) \
libimlib2.so()(64bit) \
librsvg.so()(64bit) \
libtcp-portmon.so()(64bit)"
RDEPENDS:${PN} += "/bin/bash \
/usr/bin/lua5.1 \
fontawesome-fonts \
imlib2-loaders \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libImlib2.so.1()(64bit) \
libX11.so.6()(64bit) \
libXNVCtrl.so.0()(64bit) \
libXdamage.so.1()(64bit) \
libXext.so.6()(64bit) \
libXfixes.so.3()(64bit) \
libXft.so.2()(64bit) \
libXinerama.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libcurl.so.4()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgio-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libical.so.3()(64bit) \
libircclient.so.1()(64bit) \
libiw.so.30()(64bit) \
liblua5.3.so.5()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libmariadb.so.3()(64bit) \
libmariadb.so.3(libmysqlclient_18)(64bit) \
libmicrohttpd.so.12()(64bit) \
libncurses.so.6()(64bit) \
libncurses.so.6(NCURSEST6_5.7.20081102)(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit) \
librsvg-2.so.2()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.13)(64bit) \
libstdc++.so.6(CXXABI_1.3.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.22)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit)"

inherit rpm
