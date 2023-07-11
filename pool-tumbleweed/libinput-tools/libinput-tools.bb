SUMMARY = "Utilities to display libinput configuration"
DESCRIPTION = "This tool lists the locally recognised devices and their respective \
configuration options and configuration defaults."
LICENSE = "MIT"

PV = "1.23.0"

RPM_NAME = "libinput-tools-1.23.0-1.2.aarch64.rpm"
RPM_HASH = "5bc282ebbecd4c2d1d01ee0c28e44990c3c9c0fad55412b8b3853bcd642345b2241114d92e1544966bfd0243ee4e071493a227ebe931b4e829b0f691c2df640a"

RPROVIDES:${PN} += "libinput-tools"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libevdev.so.2 \
libinput.so.10 \
libudev.so.1 \
python3-libevdev"

inherit rpm
