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

PV = "0.3.77"

RPM_NAME = "pipewire-module-x11-0_3-0.3.77-2.1.aarch64.rpm"
RPM_HASH = "849e4eefafd90eeaea74062cdb06b3cd0e8375410457bdaf4e0da772337264713fbaafe7dbb0e563cfd2a07882a236feea264c6c61ba9075de0cc751155ca3f5"

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
