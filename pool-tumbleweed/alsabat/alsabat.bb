SUMMARY = "Command-line sound tester for ALSA sound card driver"
DESCRIPTION = "BAT (Basic Audio Tester) is a simple command-line utility intended \
to help automate audio driver and sound server testing with little human \
interaction. BAT can be used to test audio quality, stress test features \
and test audio before and after PM state changes."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.9"

RPM_NAME = "alsabat-1.2.9-1.1.aarch64.rpm"
RPM_HASH = "194391ebc062d2c63be6228b1ae6775b912dbf1e430814bae74c64b6f8d5bf24908085e608935e0c4a548f048c19266da749d6251127ce3fe4674308f779788c"

RPROVIDES:${PN} += "alsabat \
alsabat(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
alsa-utils \
ld-linux-aarch64.so.1()(64bit) \
libasound.so.2()(64bit) \
libc.so.6()(64bit) \
libfftw3f.so.3()(64bit) \
libm.so.6()(64bit)"

inherit rpm
