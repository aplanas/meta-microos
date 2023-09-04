SUMMARY = "LVM2 Testsuite"
DESCRIPTION = "An extensive functional testsuite for the LVM2 Logical Volume Manager."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.03.16"

RPM_NAME = "lvm2-testsuite-2.03.16-8.1.aarch64.rpm"
RPM_HASH = "e27a07bda0cb1dfa07c66409c9dac6c9e53037ba2cd504b80caf9931e1b10e464fcd4e34e4fde0b41ead524bc181df07283f0374a7a5fc27866afdb31283f380"

RPROVIDES:${PN} += "lvm2-testsuite"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libaio.so.1 \
libc.so.6 \
libdevmapper.so.1.03 \
libgcc-s.so.1 \
liblvm2cmd2-03 \
libselinux.so.1 \
libstdc++.so.6 \
libudev.so.1 \
lvm2"

inherit rpm
