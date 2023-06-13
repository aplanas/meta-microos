SUMMARY = "Provides settings to X11 applications"
DESCRIPTION = "xsettingsd is a daemon that implements the XSETTINGS specification. \
It is intended to be small, fast, and minimally dependent on other \
libraries. It can serve as an alternative to mate-settings-daemon for users \
who are not using the MATE desktop environment but who still run GTK+ \
applications and want to configure things such as themes, font \
antialiasing/hinting, and UI sound effects."
LICENSE = "BSD-3-Clause"

PV = "1.0.2"

RPM_NAME = "xsettingsd-1.0.2-1.7.aarch64.rpm"
RPM_HASH = "c79c731a26e5524d6e8ebe0bc3e87bde84789a7c613c1a7d322408a38add8153453366f70d01cc2f920254df5e165deacc6bdde1457eaa3e597fecb1ff0ffe5d"

RPROVIDES:${PN} += "xsettingsd \
xsettingsd(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
