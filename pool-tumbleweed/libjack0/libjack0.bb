SUMMARY = "Jack Audio Connection Kit Library"
DESCRIPTION = "This package contains the library to access JACK \
(Jack Audio ConnectionKit)."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.9.22"

RPM_NAME = "libjack0-1.9.22-2.1.aarch64.rpm"
RPM_HASH = "a5e4270ba7440df057b0dcf103bd670c8f451a517df3e44a5cccdcc28e592e92cae56b80cb9eb3243553699db4c471c102e13b8c7b04d0f53731b91ef7f2e3c3"

RPROVIDES:${PN} += "libjack \
libjack.so.0 \
libjack0 \
libjack2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
