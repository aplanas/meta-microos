SUMMARY = "LIRC driver library"
DESCRIPTION = "The LIRC library. LIRC is a package that supports receiving \
and sending IR signals with the most common IR remote controls."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.1"

RPM_NAME = "liblirc0-0.10.1-10.1.aarch64.rpm"
RPM_HASH = "3a1bf6451fe1dcde219b73958ee901b446759f1cfc4d43078de228d6547f485ad34519dd649a73c5cd035168611de3332521b1cc46c0a23d85a11525ef3d3375"

RPROVIDES:${PN} += "liblirc.so.0 \
liblirc0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
