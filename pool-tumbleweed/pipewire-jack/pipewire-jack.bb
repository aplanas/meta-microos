SUMMARY = "PipeWire JACK implementation"
DESCRIPTION = "This package provides an ld.so.conf file that makes all JACK clients \
use the JACK implementation based on PipeWire instead of the original \
JACK libraries."
LICENSE = "MIT"

PV = "0.3.76"

RPM_NAME = "pipewire-jack-0.3.76-1.1.aarch64.rpm"
RPM_HASH = "db89232bf0b3c357d907801f72d980f08827482b9d65fcb099e40123e0127cd26aa2e629ca2a0a28ec502052cc03e31a699d59b06bf3986714d33f781be1094e"

RPROVIDES:${PN} += "config-pipewire-jack \
jack-daemon \
pipewire-jack"

RDEPENDS:${PN} += "/sbin/ldconfig \
libpipewire-0-3-0 \
pipewire \
pipewire-libjack-0-3"

inherit rpm
