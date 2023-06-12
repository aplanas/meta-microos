SUMMARY = "Chewing Wrapper for Fcitx"
DESCRIPTION = "Fcitx-chewing is a Chewing(新酷音) Wrapper for Fcitx. \
 \
Chewing is a set of free intelligent Chinese Phonetic IME."
LICENSE = "GPL-2.0+"

PV = "0.2.3"

RPM_NAME = "fcitx-chewing-0.2.3-1.27.aarch64.rpm"
RPM_HASH = "58b0ccff2bfecb642c0949ef19fcddbf3bd7b8b3be0398c31421d6dc220010ad285a6328bed90e7bfd542bbac2e24c4001ea288f1f0454889fd9552fae281281"

RPROVIDES:${PN} += "fcitx-chewing \
fcitx-chewing(aarch-64) \
locale(fcitx:zh_TW)"
RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6(GLIBC_2.17)(64bit) \
libchewing.so.3()(64bit)"

inherit rpm
