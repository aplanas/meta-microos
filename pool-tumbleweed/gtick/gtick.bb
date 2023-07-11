SUMMARY = "A metronome application"
DESCRIPTION = "GTick is a metronome application written for GNU/Linux and other UN*X-like \
operting systems supporting different meters (Even, 2/4, 3/4, 4/4 and more) \
and speeds ranging from 10 to 1000 bpm."
LICENSE = "GPL-3.0-only"

PV = "0.5.5"

RPM_NAME = "gtick-0.5.5-1.15.aarch64.rpm"
RPM_HASH = "2f75ad4a7163c2e4aca296479c3feeee39536d942fa05e4db80f8775aa0592bb4d61b693e530ce1556a756e1666b8dab21fcf4eea238384b8e5d18e6c5944403"

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
