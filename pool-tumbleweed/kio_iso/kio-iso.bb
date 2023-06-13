SUMMARY = "KIO slave to access ISO images"
DESCRIPTION = "KIO slave to access ISO images like zip- or tar.gz-archives in your \
file-browser."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.0"

RPM_NAME = "kio_iso-2.8.0-1.3.aarch64.rpm"
RPM_HASH = "b0bda4953d808a8dcfdf07d1c21d76230bdb4e7eaee302ec18697b1e125b75b5d3c59a3463d7f4c9db2e920ecc1b7d43625cdd1453129a8792d85ae680130808"

RPROVIDES:${PN} += "config(kio_iso) \
kde4-kio_iso \
kio_iso \
kio_iso(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5Archive.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libz.so.1()(64bit)"

inherit rpm
