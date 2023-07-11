SUMMARY = "Simple TTY terminal I/O application"
DESCRIPTION = "Tio is a simple TTY terminal application which features a straightforward \
commandline interface to easily connect to TTY devices for basic input/output."
LICENSE = "GPL-2.0-or-later"

PV = "2.6"

RPM_NAME = "tio-2.6-1.1.aarch64.rpm"
RPM_HASH = "6dd7f41bc92a5ab51a8ed498f6f12514dc7142744a1500ef73a6f77f2c3274689283baaadc2b2782c305b466967b8d80f49ef674b56af80ccdbc5359942a58e7"

RPROVIDES:${PN} += "tio"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libinih.so.0"

inherit rpm
