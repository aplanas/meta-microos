SUMMARY = "Command Line Editing and History Library"
DESCRIPTION = "libedit is a command line editing and history library. It is designed \
to be used by interactive programs that allow the user to type commands \
at a terminal prompt."
LICENSE = "BSD-3-Clause"

PV = "20210910.3.1"

RPM_NAME = "libedit0-20210910.3.1-2.2.aarch64.rpm"
RPM_HASH = "7449f24cde8162f1e0b0841a8bc3c170e77d030cae8633ef61d56f296c1ef38807c26a938b7b580b814d2b762ef696bc581da429ba73b72fd6f3fbec2ab6780f"

RPROVIDES:${PN} += "libedit \
libedit.so.0 \
libedit0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtinfo.so.6"

inherit rpm
