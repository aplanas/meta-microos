SUMMARY = "Tool for calculating display info like DPI and aspect ratio"
DESCRIPTION = "A tool to analyze displays and to input a few details and figure out the aspect \
ratio, DPI, and other details of a particular display. Can be used to decide \
which laptop or external monitor to purchase, and if it would be considered \
HiDPI."
LICENSE = "GPL-3.0-or-later"

PV = "3.1.4"

RPM_NAME = "dippi-3.1.4-1.7.aarch64.rpm"
RPM_HASH = "fb1f997596c3c92dde7603711741a431052684009b9d007620ddab32f8d958b7118348929d3e16ebebbb31abfce65610cde960172d1003c6514ad18bee34782f"

RPROVIDES:${PN} += "dippi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgtk-3.so.0 \
libhandy-1.so.0 \
libm.so.6"

inherit rpm
