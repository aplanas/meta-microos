SUMMARY = "PipeWire JACK implementation"
DESCRIPTION = "This package provides an ld.so.conf file that makes all JACK clients \
use the JACK implementation based on PipeWire instead of the original \
JACK libraries."
LICENSE = "MIT"

PV = "0.3.74"

RPM_NAME = "pipewire-jack-0.3.74-1.1.aarch64.rpm"
RPM_HASH = "55b7594f02734be010a4276191c04d886c77fbaeb85757f841b29da0d990556ca26a16ce2bcc7bb00405a606e2360e283e10394d0343990fd2aa6024e8069fde"

RPROVIDES:${PN} += "config-pipewire-jack \
jack-daemon \
pipewire-jack"

RDEPENDS:${PN} += "/sbin/ldconfig \
libpipewire-0-3-0 \
pipewire \
pipewire-libjack-0-3"

inherit rpm
