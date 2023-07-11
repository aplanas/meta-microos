SUMMARY = "A tool for control characters and terminal control sequences"
DESCRIPTION = "Teseq is a tool for analyzing files that contain control characters and \
terminal control sequences, by printing these control sequences and their \
meanings in readable English. It is intended to be useful for debugging \
terminal emulators, and programs that make heavy use of advanced terminal \
features such as cursor movement, coloring, and other effects."
LICENSE = "GPL-3.0+"

PV = "1.1.1"

RPM_NAME = "teseq-1.1.1-1.27.aarch64.rpm"
RPM_HASH = "3d562b999246193ebd8612a839623a67e75fa343f42d76ea2823f683c3148be87b62fef376b984abf97a40704b0ffef1b0e64332163541173e0d8fabc3b2600c"

RPROVIDES:${PN} += "teseq"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
