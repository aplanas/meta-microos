SUMMARY = "JACK I/O Plug-In for ALSA Library"
DESCRIPTION = "This package contains the JACK (Jack Audio Connection Kit) I/O plug-in \
for ALSA library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.7.1"

RPM_NAME = "alsa-plugins-jack-1.2.7.1-4.5.aarch64.rpm"
RPM_HASH = "0beb40663ad22150720b3b1dd885e57c4de4d26a9f5a09493ebf5b10719ebbe2d2c91b6cfeb2f30b2f127ff71000da9f4f1005570ab2da6dea4462827fec7e36"

RPROVIDES:${PN} += "alsa-plugins-jack \
alsa-plugins-jack(aarch-64) \
libasound_module_pcm_jack.so()(64bit)"

RDEPENDS:${PN} += "jack \
ld-linux-aarch64.so.1()(64bit) \
libasound.so.2()(64bit) \
libc.so.6()(64bit) \
libjack.so.0()(64bit)"

inherit rpm
