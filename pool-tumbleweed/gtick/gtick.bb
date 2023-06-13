SUMMARY = "A metronome application"
DESCRIPTION = "GTick is a metronome application written for GNU/Linux and other UN*X-like \
operting systems supporting different meters (Even, 2/4, 3/4, 4/4 and more) \
and speeds ranging from 10 to 1000 bpm."
LICENSE = "GPL-3.0-only"

PV = "0.5.5"

RPM_NAME = "gtick-0.5.5-1.14.aarch64.rpm"
RPM_HASH = "341abddbc2e480a48e5bb03f4c811fc495c63443ce7b88508bd7b53a8e18201a876f0f14904f33d80c039400d522c495fa2b5890f2e680c19ca32556cbc87808"

RPROVIDES:${PN} += "application() \
application(gtick.desktop) \
gtick \
gtick(aarch-64) \
metainfo() \
metainfo(gtick.appdata.xml)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libpango-1.0.so.0()(64bit) \
libpulse-simple.so.0()(64bit) \
libpulse-simple.so.0(PULSE_0)(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit)"

inherit rpm
