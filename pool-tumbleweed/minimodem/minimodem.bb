SUMMARY = "General-purpose software audio FSK modem"
DESCRIPTION = "Minimodem is a command-line program which decodes (or generates) audio \
modem tones at any specified baud rate, using various framing protocols. \
It acts a general-purpose software FSK modem, and includes support for \
various standard FSK protocols such as Bell103, Bell202, RTTY, TTY/TDD, \
NOAA SAME, and Caller-ID. \
 \
Minimodem can play and capture audio modem tones in real-time via the \
system audio device, or in batched mode via audio files. \
 \
Minimodem can be used to transfer data between nearby computers using an \
audio cable (or just via sound waves), or between remote computers using \
radio, telephone, or another audio communications medium."
LICENSE = "GPL-3.0+"

PV = "0.24"

RPM_NAME = "minimodem-0.24-1.22.aarch64.rpm"
RPM_HASH = "4c07525d25ac65bf15db5aa0ee008f1431a676fb808b5ccefbc5fdb3e92b55ce6e3afbf77b2e2297a549669841000348333216a1a2ab6e014989e5ef087d7d35"

RPROVIDES:${PN} += "minimodem"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libfftw3f.so.3 \
libm.so.6 \
libpulse-simple.so.0 \
libpulse.so.0 \
libsndfile.so.1"

inherit rpm
