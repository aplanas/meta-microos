SUMMARY = "PipeWire JACK implementation"
DESCRIPTION = "This package provides an ld.so.conf file that makes all JACK clients \
use the JACK implementation based on PipeWire instead of the original \
JACK libraries."
LICENSE = "MIT"

PV = "0.3.72"

RPM_NAME = "pipewire-jack-0.3.72-1.1.aarch64.rpm"
RPM_HASH = "45b871999748f4623616b6a59c297cf4226757ab731534a50db2b05d97d193ef6e53cfb3a56cdabf651ce95dcd46fd2713188c20be7e630ba88557d11ddf77e3"

RPROVIDES:${PN} += "config-pipewire-jack \
jack-daemon \
pipewire-jack"

RDEPENDS:${PN} += "/sbin/ldconfig \
libpipewire-0-3-0 \
pipewire \
pipewire-libjack-0-3"

inherit rpm
