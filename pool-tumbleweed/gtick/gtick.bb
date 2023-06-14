SUMMARY = "A metronome application"
DESCRIPTION = "GTick is a metronome application written for GNU/Linux and other UN*X-like \
operting systems supporting different meters (Even, 2/4, 3/4, 4/4 and more) \
and speeds ranging from 10 to 1000 bpm."
LICENSE = "GPL-3.0-only"

PV = "0.5.5"

RPM_NAME = "gtick-0.5.5-1.14.aarch64.rpm"
RPM_HASH = "341abddbc2e480a48e5bb03f4c811fc495c63443ce7b88508bd7b53a8e18201a876f0f14904f33d80c039400d522c495fa2b5890f2e680c19ca32556cbc87808"

RPROVIDES:${PN} += "gtick"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpulse-simple.so.0 \
libpulse.so.0"

inherit rpm
