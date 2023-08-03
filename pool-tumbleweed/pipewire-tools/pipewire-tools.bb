SUMMARY = "The PipeWire Tools"
DESCRIPTION = "This package contains command line utilities for the PipeWire media server."
LICENSE = "MIT"

PV = "0.3.76"

RPM_NAME = "pipewire-tools-0.3.76-1.1.aarch64.rpm"
RPM_HASH = "fcb43b8a1a0daa57449275d3e027984d158ae1ac047a8bbd1cb88c71358147187226bbfcfb86ee81e2f4a9bc471d23d7edd30468d2804bdce3db9d54e55790a8"

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
