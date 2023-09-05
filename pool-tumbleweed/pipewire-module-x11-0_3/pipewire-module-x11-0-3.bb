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

PV = "0.3.79"

RPM_NAME = "pipewire-module-x11-0_3-0.3.79-1.2.aarch64.rpm"
RPM_HASH = "24cba2c16783a059adcc44d0d50989c18b51636cee09eada95a14e88e40e09874b5efb4d72fadd6bc1b25eda2830b6e3d9c90d221d3fccd8095b9a0ca0f8d1d9"

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
