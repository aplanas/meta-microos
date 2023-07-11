SUMMARY = "Chewing Wrapper for Fcitx"
DESCRIPTION = "Fcitx-chewing is a Chewing(新酷音) Wrapper for Fcitx. \
 \
Chewing is a set of free intelligent Chinese Phonetic IME."
LICENSE = "GPL-2.0+"

PV = "0.2.3"

RPM_NAME = "fcitx-chewing-0.2.3-1.28.aarch64.rpm"
RPM_HASH = "a6443953b260e1e4adb047144e86e0ca3176e63707d38e521afd7d6a9abbb9737604cc095dee454b41e3a97b0eb53a43394d28bbcdb772ba9ac4479b1bf15225"

RPROVIDES:${PN} += "fcitx-chewing \
locale-fcitx-zh-TW"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libchewing.so.3"

inherit rpm
