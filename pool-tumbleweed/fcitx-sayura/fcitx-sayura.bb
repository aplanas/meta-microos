SUMMARY = "Fcitx input module for Sinhala"
DESCRIPTION = "Fcitx is a Flexible Context-aware Input Tool with eXtension. \
 \
Fcitx-Sayura is a Sinhala input method for Fcitx input method framework ported from IBus-Sayura."
LICENSE = "GPL-2.0+"

PV = "0.1.2"

RPM_NAME = "fcitx-sayura-0.1.2-1.20.aarch64.rpm"
RPM_HASH = "98d49f28b1300fd93858180e5bfc546e56662d8583c51808a6482ff424d108c1021c2a6e423e49aa29bedd613e69cc1ab49363474e5c91a010ecb774890a1f73"

RPROVIDES:${PN} += "fcitx-sayura \
fcitx-sayura(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
fcitx \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
