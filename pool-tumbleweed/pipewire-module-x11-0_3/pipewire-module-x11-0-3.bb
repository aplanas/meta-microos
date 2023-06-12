SUMMARY = "X11 support For PipeWire, A Multimedia Framework"
DESCRIPTION = "PipeWire is a server and user space API to deal with multimedia pipelines. \
 \
The framework is used to build a modular daemon that can be configured to: \
 \
 * Be a low-latency audio server with features like pulseaudio and/or jack; \
 * A video capture server that can manage hardware video capture devices \
   and provide access to them; \
 * A central hub where video can be made available for other applications \
   such as the gnome-shell screencast API. \
 \
This package contains X11 bell support for PipeWire."
LICENSE = "MIT"

PV = "0.3.71"

RPM_NAME = "pipewire-module-x11-0_3-0.3.71-3.1.aarch64.rpm"
RPM_HASH = "6527bc02cd18d1f2dfbccb610525f3e53e16b01f2a689a70e145d06e0d54ec41c7469993b27a07b688fb42e94489b1b383c264a20a59a793fc6de10f0cefab20"

RPROVIDES:${PN} += "libpipewire-module-x11-bell.so()(64bit) \
pipewire-module-x11-0_3 \
pipewire-module-x11-0_3(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXfixes.so.3()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcanberra.so.0()(64bit) \
libpipewire-0.3.so.0()(64bit) \
libpipewire-0_3-0 \
pipewire"

inherit rpm
