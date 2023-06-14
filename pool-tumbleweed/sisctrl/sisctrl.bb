SUMMARY = "SiS Display Control Panel"
DESCRIPTION = "Utility to set some display properties during server runtime."
LICENSE = "GPL-2.0-only"

PV = "0.0.20051202"

RPM_NAME = "sisctrl-0.0.20051202-246.11.aarch64.rpm"
RPM_HASH = "24f62d0d993ac9d509e5a51f92a5f2e43eaa06dbfa29e3f87d274a5349d5394d1a9e35cced2f5894cc80dfa27d100af13acd08fd2982f501b3b682825ce95a8b"

RPROVIDES:${PN} += "sisctrl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXinerama.so.1 \
libXrandr.so.2 \
libXv.so.1 \
libXxf86vm.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libm.so.6 \
libpango-1.0.so.0"

inherit rpm
