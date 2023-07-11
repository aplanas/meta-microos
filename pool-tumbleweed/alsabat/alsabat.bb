SUMMARY = "Command-line sound tester for ALSA sound card driver"
DESCRIPTION = "BAT (Basic Audio Tester) is a simple command-line utility intended \
to help automate audio driver and sound server testing with little human \
interaction. BAT can be used to test audio quality, stress test features \
and test audio before and after PM state changes."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.9"

RPM_NAME = "alsabat-1.2.9-1.2.aarch64.rpm"
RPM_HASH = "b0b64366ca5bd260c85b683509527acf5657c85d8fb791ca01a2c93f4dd418df466de351b565697a4e00e66b727f8711dbd73d9af4d5505f0fe6da42c6824a67"

RPROVIDES:${PN} += "alsabat"

RDEPENDS:${PN} += "/usr/bin/bash \
alsa-utils \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libfftw3f.so.3 \
libm.so.6"

inherit rpm
