SUMMARY = "Buffering stdin and stdout"
DESCRIPTION = "This is a program designed to speed up writing tapes on remote tape \
drives.  When this program is put 'in the pipe,' two processes are \
started.  One process reads from standard-in and the other writes to \
standard-out.  Both processes communicate via shared memory."
LICENSE = "GPL-2.0-or-later"

PV = "1.19"

RPM_NAME = "buffer-1.19-867.12.aarch64.rpm"
RPM_HASH = "c5d2a544b7d502a7645486dc0dcefb79a4af3b5e4a7937b1e90ea47fe0b2b1984f57a8b33d8a6836da59dc5194c41af33adddc4acaa161eaab1d488dac79b974"

RPROVIDES:${PN} += "buffer buffer(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
