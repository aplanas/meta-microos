SUMMARY = "Chinese Zone-bit(QuWei) engine for fcitx"
DESCRIPTION = "Chinese Zone-bit(QuWei) engine for Fcitx input method framework."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "fcitx-quwei-4.2.9.9-1.5.aarch64.rpm"
RPM_HASH = "cdd38c8158392adc3e9e66cd0b7bb6f0cba12a63710cd14866dfa954f5557ce7502d184ac05cc62461215a0249f631f4d62113da4d9f8540f509733c611a89e1"

RPROVIDES:${PN} += "fcitx-quwei \
fcitx-quwei(aarch-64)"
RDEPENDS:${PN} += "fcitx \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
