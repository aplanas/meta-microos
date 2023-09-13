SUMMARY = "Command-line sound tester for ALSA sound card driver"
DESCRIPTION = "BAT (Basic Audio Tester) is a simple command-line utility intended \
to help automate audio driver and sound server testing with little human \
interaction. BAT can be used to test audio quality, stress test features \
and test audio before and after PM state changes."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.10"

RPM_NAME = "alsabat-1.2.10-1.1.aarch64.rpm"
RPM_HASH = "35ea2e0b42e21c0425ae7d7a00ee3abdb50192ce24c708ac3209e074fbeec7e03e244f4127cc45da641bf2a1cf99a7de8baa98ce6a4b8921f7db16f181f1b039"

RPROVIDES:${PN} += "alsabat"

RDEPENDS:${PN} += "/usr/bin/bash \
alsa-utils \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libfftw3f.so.3 \
libm.so.6"

inherit rpm
