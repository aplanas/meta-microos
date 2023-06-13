SUMMARY = "Core library of fcitx"
DESCRIPTION = "Core library of fcitx."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "libfcitx-core0-4.2.9.9-1.5.aarch64.rpm"
RPM_HASH = "76669ec50e464fdda8d2abee5dca8b42e766f6f1ef7832aa0f2777225a3f18657bccf9d3a53714eb63409d53dbbd5ca2fce6ce2fafdd8d5dcf601665a0ce367e"

RPROVIDES:${PN} += "libfcitx-4_2_9 \
libfcitx-core.so.0()(64bit) \
libfcitx-core0 \
libfcitx-core0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libfcitx-config.so.4()(64bit) \
libfcitx-utils.so.0()(64bit)"

inherit rpm
