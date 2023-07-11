SUMMARY = "C++ bindings for ldas-tools"
DESCRIPTION = "This package provides a shared library for ldas-tools-framecpp - a toolkit providing C++ \
bindings for working with frame data."
LICENSE = "GPL-2.0-or-later"

PV = "2.7.0"

RPM_NAME = "libframecpp8-7-2.7.0-2.13.aarch64.rpm"
RPM_HASH = "2e835c74abe9938fc4fbd10fa87158f2925fdb235f712dabdd8439ef13ad7426c7ad8fb3fa716d83e2fde2d11a961f5100a20bbaa31c35c0484296a6f5afa78e"

RPROVIDES:${PN} += "libframecpp8-7 \
libframecpp8.so.7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libframecpp3.so.6 \
libframecpp4.so.8 \
libframecpp6.so.8 \
libframecpp7.so.4 \
libframecppcmn.so.11 \
libgcc-s.so.1 \
libldastoolsal.so.7 \
libstdc++.so.6"

inherit rpm
