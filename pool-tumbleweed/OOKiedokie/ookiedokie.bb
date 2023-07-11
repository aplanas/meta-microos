SUMMARY = "A tool for transmitting and receiving OOK-modulated data with SDRs"
DESCRIPTION = "OOKiedokie is a tool intended to help SDR users interface with miscellaneous \
wireless devices utilizing On-Off Keying, a very simple form of \
Amplitude Shift Keying modulation."
LICENSE = "MIT"

PV = "0.0.0+git.20151230"

RPM_NAME = "OOKiedokie-0.0.0+git.20151230-3.16.aarch64.rpm"
RPM_HASH = "a35a5d2dec104df4608568dbb47afbff1640e4ab42e33af18a4d7bd2b9e6097b05f7de582ad898a3b9ded325c179704c66740f31adb5980baafc3fcac9c9b7de"

RPROVIDES:${PN} += "OOKiedokie"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbladeRF.so.2 \
libc.so.6 \
libjansson.so.4"

inherit rpm
