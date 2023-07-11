SUMMARY = "Provides settings to X11 applications"
DESCRIPTION = "xsettingsd is a daemon that implements the XSETTINGS specification. \
It is intended to be small, fast, and minimally dependent on other \
libraries. It can serve as an alternative to mate-settings-daemon for users \
who are not using the MATE desktop environment but who still run GTK+ \
applications and want to configure things such as themes, font \
antialiasing/hinting, and UI sound effects."
LICENSE = "BSD-3-Clause"

PV = "1.0.2"

RPM_NAME = "xsettingsd-1.0.2-1.8.aarch64.rpm"
RPM_HASH = "10660d17984e59f1cb8ea876d0669a6408d589458f449f822f58195a0eadd0ddc56e839a4767169916c99ce2c2b0642f1dbabafd7394f6f327589de31731844a"

RPROVIDES:${PN} += "xsettingsd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
