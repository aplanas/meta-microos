SUMMARY = "The PipeWire Tools"
DESCRIPTION = "This package contains command line utilities for the PipeWire media server."
LICENSE = "MIT"

PV = "0.3.77"

RPM_NAME = "pipewire-tools-0.3.77-2.1.aarch64.rpm"
RPM_HASH = "6eb77248359ef6a7cff8c73a17dde0a1cc2ebfdf4cc71a203708b7027b666bac027397170de6f79af23f81c073263360d2a62f0ecce3328d7c512036f72b3645"

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
