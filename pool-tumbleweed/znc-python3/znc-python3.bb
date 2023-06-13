SUMMARY = "Python support for ZNC"
DESCRIPTION = "ZNC is an IRC bouncer with many features like detaching, multiple \
users, per channel playback buffer, SSL, IPv6, transparent DCC bouncing, and \
C++ module support. \
 \
This package contains the Python extension to ZNC."
LICENSE = "Apache-2.0"

PV = "1.8.2"

RPM_NAME = "znc-python3-1.8.2-3.7.aarch64.rpm"
RPM_HASH = "b4b558785290d751fa603f79d37250d367236d2a807545db7428fd9cad20f13ad395cd21ba13f8189a5ff05320e179f62161c20d5e9d34768c10ec639d9997d9"

RPROVIDES:${PN} += "znc-python \
znc-python3 \
znc-python3(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libpython3.10.so.1.0()(64bit) \
libstdc++.so.6()(64bit) \
python3 \
znc"

inherit rpm
