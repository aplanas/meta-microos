SUMMARY = "Rime Input Method Engine"
DESCRIPTION = "Rime is an Traditional Chinese input method engine. \
Its idea comes from ancient Chinese brush and carving art. \
Mainly it's about to express your thinking with your keystrokes."
LICENSE = "BSD-3-Clause"

PV = "1.7.3"

RPM_NAME = "rime-1.7.3-2.18.aarch64.rpm"
RPM_HASH = "9a42703921e45190b6766e8d8089be8a4312e6e1eaf02c89bd2777a36273bcfd9a80fc02f6ff2004c669fa38e25da2a491953ec5eec8ac397c0bba6601114ae3"

RPROVIDES:${PN} += "rime \
rime(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libboost_filesystem.so.1.82.0()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libglog.so.0()(64bit) \
librime.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
