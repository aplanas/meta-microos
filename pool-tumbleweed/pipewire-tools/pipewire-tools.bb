SUMMARY = "The PipeWire Tools"
DESCRIPTION = "This package contains command line utilities for the PipeWire media server."
LICENSE = "MIT"

PV = "0.3.72"

RPM_NAME = "pipewire-tools-0.3.72-1.1.aarch64.rpm"
RPM_HASH = "b7ded6e385f15c878f5cdedba170fe249d99464ee9b1eafa4fc1c533f8beff13cf3dc1bdb189f3bafd8bdfc11813c87b03a5eeaad0eec374688c108577e5fa64"

RPROVIDES:${PN} += "pipewire-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libm.so.6 \
libncursesw.so.6 \
libpipewire-0.3.so.0 \
libreadline.so.8 \
libsndfile.so.1 \
libtinfo.so.6"

inherit rpm
