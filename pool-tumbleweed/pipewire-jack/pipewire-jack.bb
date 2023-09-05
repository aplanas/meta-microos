SUMMARY = "PipeWire JACK implementation"
DESCRIPTION = "This package provides an ld.so.conf file that makes all JACK clients \
use the JACK implementation based on PipeWire instead of the original \
JACK libraries."
LICENSE = "MIT"

PV = "0.3.79"

RPM_NAME = "pipewire-jack-0.3.79-1.2.aarch64.rpm"
RPM_HASH = "77241d9478ae4b833886a2d991bf4f311b49b9c6311c589e95f3e447213942eef47d4cc00d7a63f4575da49523d39e023b27751b26fd84b1a081cdadd0430c2a"

RPROVIDES:${PN} += "config-pipewire-jack \
jack-daemon \
pipewire-jack"

RDEPENDS:${PN} += "/sbin/ldconfig \
libpipewire-0-3-0 \
pipewire \
pipewire-libjack-0-3"

inherit rpm
