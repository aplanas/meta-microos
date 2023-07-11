SUMMARY = "Real-time microphone noise suppression on Linux"
DESCRIPTION = "NoiseTorch is an easy to use open source application for Linux with PulseAudio. \
It creates a virtual microphone that suppresses noise, in any application. Use \
whichever conferencing or VOIP application you like and simply select the \
NoiseTorch Virtual Microphone as input to torch the sound of your mechanical \
keyboard, computer fans, trains and the likes."
LICENSE = "GPL-3.0-or-later"

PV = "0.12.2"

RPM_NAME = "noisetorch-0.12.2-2.6.aarch64.rpm"
RPM_HASH = "bf045bd4fcf6bc56a6f53b49f729c41b6cbb25bcf77ae4bdcf64a68b09efb6e8953636fc579609eb23314168347f880274a6b12bfbe782e231c7d4e649b910eb"

RPROVIDES:${PN} += "noisetorch"

RDEPENDS:${PN} += ""

inherit rpm
