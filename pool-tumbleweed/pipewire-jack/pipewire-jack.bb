SUMMARY = "PipeWire JACK implementation"
DESCRIPTION = "This package provides an ld.so.conf file that makes all JACK clients \
use the JACK implementation based on PipeWire instead of the original \
JACK libraries."
LICENSE = "MIT"

PV = "0.3.77"

RPM_NAME = "pipewire-jack-0.3.77-2.1.aarch64.rpm"
RPM_HASH = "f6c6e623d1a8e4e77b1b343e9fedba35759903a59bb344a28db8bd095464b67f98f47ae2249651148e8de90280e69452d63a7278125d55e56c8f9dc5405c46e5"

RPROVIDES:${PN} += "config-pipewire-jack \
jack-daemon \
pipewire-jack"

RDEPENDS:${PN} += "/sbin/ldconfig \
libpipewire-0-3-0 \
pipewire \
pipewire-libjack-0-3"

inherit rpm
