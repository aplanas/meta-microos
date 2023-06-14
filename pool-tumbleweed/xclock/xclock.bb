SUMMARY = "Analog / digital clock for X"
DESCRIPTION = "xclock is the classic X Window System clock utility. It displays \
the time in analog or digital form, continuously updated at a \
frequency which may be specified by the user."
LICENSE = "X11"

PV = "1.1.1"

RPM_NAME = "xclock-1.1.1-1.6.aarch64.rpm"
RPM_HASH = "766746f9d3b015a6c0f6cd9c93378f8917c63cab023cffa0b2b7b9a7df8f828dd06378bd99cd659bab740c5fdd2f224ed93143d110ac2983b95e0b863d8f3049"

RPROVIDES:${PN} += "xclock"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXft.so.2 \
libXmu.so.6 \
libXrender.so.1 \
libXt.so.6 \
libc.so.6 \
libm.so.6 \
libxkbfile.so.1"

inherit rpm
