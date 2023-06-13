SUMMARY = "A tool for control characters and terminal control sequences"
DESCRIPTION = "Teseq is a tool for analyzing files that contain control characters and \
terminal control sequences, by printing these control sequences and their \
meanings in readable English. It is intended to be useful for debugging \
terminal emulators, and programs that make heavy use of advanced terminal \
features such as cursor movement, coloring, and other effects."
LICENSE = "GPL-3.0+"

PV = "1.1.1"

RPM_NAME = "teseq-1.1.1-1.26.aarch64.rpm"
RPM_HASH = "3ff106dc2aaaf76005efc0c36147676f9e1cea604b2fac84cfa44d43a7375cd00bbe6a46255d2e1f6301c5d146a9f8c8073b5b11cd011a157b436b3c62ae9104"

RPROVIDES:${PN} += "teseq \
teseq(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/env \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
