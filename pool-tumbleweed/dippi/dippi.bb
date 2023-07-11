SUMMARY = "Tool for calculating display info like DPI and aspect ratio"
DESCRIPTION = "A tool to analyze displays and to input a few details and figure out the aspect \
ratio, DPI, and other details of a particular display. Can be used to decide \
which laptop or external monitor to purchase, and if it would be considered \
HiDPI."
LICENSE = "GPL-3.0-or-later"

PV = "3.1.4"

RPM_NAME = "dippi-3.1.4-1.8.aarch64.rpm"
RPM_HASH = "30e4992c2e18dcb7eb4c35e350498372f81cc1d9a7f60f08d69ddb4b952503bec1236a7b36238e1f4f014e05e8d5e1dd434b559ec58cc7ab3524a89034f2a09c"

RPROVIDES:${PN} += "dippi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgtk-3.so.0 \
libhandy-1.so.0"

inherit rpm
