SUMMARY = "Core library of fcitx"
DESCRIPTION = "Core library of fcitx."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "libfcitx-core0-4.2.9.9-1.6.aarch64.rpm"
RPM_HASH = "6795cada5672ebf3578224ae45fa26949c2123cf9cb2b5c5486d2f445aec5046e0abf5dda56d9873b746b0fb0033ee4da5b0328b35743d064df187bb06ca98cc"

RPROVIDES:${PN} += "libfcitx-4-2-9 \
libfcitx-core.so.0 \
libfcitx-core0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfcitx-config.so.4 \
libfcitx-utils.so.0"

inherit rpm
