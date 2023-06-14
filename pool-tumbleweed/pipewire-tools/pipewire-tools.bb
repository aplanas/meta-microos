SUMMARY = "The PipeWire Tools"
DESCRIPTION = "This package contains command line utilities for the PipeWire media server."
LICENSE = "MIT"

PV = "0.3.71"

RPM_NAME = "pipewire-tools-0.3.71-3.1.aarch64.rpm"
RPM_HASH = "38af9288e9bebd9fb8177786cac35d87b90b609a1811be23ca50253fbb38502cc56085f08c8f44db3ede9f8c0dd8e6a63360cd85bd05bf824d2221697f4a6638"

RPROVIDES:${PN} += "pipewire-tools"

RDEPENDS:${PN} += "/bin/sh \
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
