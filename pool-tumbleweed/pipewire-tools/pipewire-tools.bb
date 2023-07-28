SUMMARY = "The PipeWire Tools"
DESCRIPTION = "This package contains command line utilities for the PipeWire media server."
LICENSE = "MIT"

PV = "0.3.74"

RPM_NAME = "pipewire-tools-0.3.74-1.1.aarch64.rpm"
RPM_HASH = "4c8182cd7563a50cbf6e67a1bc58c175f5bb997cc1d3b0eae14a478f5001b4a329bae0d3a768a19af1929ad7a659a865b91910c19aeda448ca7f2c0ef9ab507e"

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
