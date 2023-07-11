SUMMARY = "Util library of fcitx"
DESCRIPTION = "Util library of fcitx"
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "libfcitx-utils0-4.2.9.9-1.6.aarch64.rpm"
RPM_HASH = "892c76a2c6855c4ff541336d9ac17d5eba75d25aaec3751dff73633c16cb2a89dadf117d19b10204bce3b9dcbcf297bb2bf6eb53fc991e8f547add97b59e6440"

RPROVIDES:${PN} += "libfcitx-utils.so.0 \
libfcitx-utils0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
