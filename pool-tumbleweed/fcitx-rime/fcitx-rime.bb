SUMMARY = "Rime input engine support for Fcitx"
DESCRIPTION = "Rime is an Traditional Chinese input method engine. \
Its idea comes from ancient Chinese brush and carving art. \
Mainly it's about to express your thinking with your keystrokes. \
 \
This package is the Fcitx implentation of RIME."
LICENSE = "GPL-2.0+"

PV = "0.3.2"

RPM_NAME = "fcitx-rime-0.3.2-2.11.aarch64.rpm"
RPM_HASH = "30657bbcb36f9398d99cc044f4d8be7281eecbfbd9139fbf4999ec917a14629f67c78eca20e57bff87d22c138dd27f4d1ef118fd5776626e3d6c654e9b591680"

RPROVIDES:${PN} += "fcitx-rime \
fcitx-rime(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
fcitx \
libc.so.6(GLIBC_2.17)(64bit) \
librime.so.1()(64bit)"

inherit rpm
