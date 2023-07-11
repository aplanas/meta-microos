SUMMARY = "Chinese Zone-bit(QuWei) engine for fcitx"
DESCRIPTION = "Chinese Zone-bit(QuWei) engine for Fcitx input method framework."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "fcitx-quwei-4.2.9.9-1.6.aarch64.rpm"
RPM_HASH = "a8205125983b93a6a0269116016d55ccedf6be710828439f1ccefdd5146cad6b58c0b1adb75810412bef2985a487ef4f769917e7ebf229da7cd59a9876f19e06"

RPROVIDES:${PN} += "fcitx-quwei"

RDEPENDS:${PN} += "fcitx \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
