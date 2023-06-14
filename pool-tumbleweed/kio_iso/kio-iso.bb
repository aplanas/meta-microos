SUMMARY = "KIO slave to access ISO images"
DESCRIPTION = "KIO slave to access ISO images like zip- or tar.gz-archives in your \
file-browser."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.0"

RPM_NAME = "kio_iso-2.8.0-1.3.aarch64.rpm"
RPM_HASH = "b0bda4953d808a8dcfdf07d1c21d76230bdb4e7eaee302ec18697b1e125b75b5d3c59a3463d7f4c9db2e920ecc1b7d43625cdd1453129a8792d85ae680130808"

RPROVIDES:${PN} += "config-kio-iso \
kde4-kio-iso \
kio-iso"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5ConfigCore.so.5 \
libKF5KIOCore.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
