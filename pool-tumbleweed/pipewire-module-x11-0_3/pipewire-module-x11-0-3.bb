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

PV = "0.3.76"

RPM_NAME = "pipewire-module-x11-0_3-0.3.76-1.1.aarch64.rpm"
RPM_HASH = "9eef7ed37957d35f3d18df05d06af27625c1cb97c0db6239ef438e4646823848d0fcc92e47bb93f0fca9856cad594b1ffdf55f495a6592969b7304743b6726bb"

RPROVIDES:${PN} += "libpipewire-module-x11-bell.so \
pipewire-module-x11-0-3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXfixes.so.3 \
libc.so.6 \
libcanberra.so.0 \
libpipewire-0-3-0 \
libpipewire-0.3.so.0 \
pipewire"

inherit rpm
