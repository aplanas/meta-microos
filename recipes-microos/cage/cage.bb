SUMMARY = "Wayland Kiosk"
DESCRIPTION = "A Wayland Kiosk."
LICENSE = "MIT"

PV = "0.1.4+39.a81ab70"

RPM_NAME = "cage-0.1.4+39.a81ab70-1.2.aarch64.rpm"
RPM_HASH = "dc459baa136286c07990a88e54d2d49c8168958646f221fa82c530946bc2ce9349556b80a51fc96ab832f38f0167cfa47103ba4f32a5c99a825a02b9eae8dd83"

RPROVIDES:${PN} += "cage cage(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libwayland-server.so.0()(64bit) libwlroots.so.11()(64bit) libxkbcommon.so.0()(64bit) libxkbcommon.so.0(V_0.5.0)(64bit)"

inherit rpm
