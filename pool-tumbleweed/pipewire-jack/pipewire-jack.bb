SUMMARY = "PipeWire JACK implementation"
DESCRIPTION = "This package provides a JACK implementation based on PipeWire"
LICENSE = "MIT"

PV = "0.3.71"

RPM_NAME = "pipewire-jack-0.3.71-3.1.aarch64.rpm"
RPM_HASH = "6a0d4c5f410fee962770ab74a4beccb0e315a26e18475a48179acd4f509c4391ad3dc0641e23fc8ff63fc9992752f5318425018ad2602ab72e5ebd1bf922f26d"

RPROVIDES:${PN} += "config(pipewire-jack) \
jack-daemon \
pipewire-jack \
pipewire-jack(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libpipewire-0_3-0 \
pipewire \
pipewire-libjack-0_3"

inherit rpm
