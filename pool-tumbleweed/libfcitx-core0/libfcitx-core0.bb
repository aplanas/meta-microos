SUMMARY = "Core library of fcitx"
DESCRIPTION = "Core library of fcitx."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "libfcitx-core0-4.2.9.9-2.1.aarch64.rpm"
RPM_HASH = "9ea487f4ab9df6240b91e6919fa9fb195fd67208643da792a20473dd80bae2a9ff1374587c642ab99820341e83f19a80b8666694650ddcf01c9204326483945c"

RPROVIDES:${PN} += "libfcitx-4-2-9 \
libfcitx-core.so.0 \
libfcitx-core0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfcitx-config.so.4 \
libfcitx-utils.so.0"

inherit rpm
