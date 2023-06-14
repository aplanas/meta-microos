SUMMARY = "Dependency injection framework for Qt"
DESCRIPTION = "injeqt is an attempt to build a powerful and reliable dependency injection \
framework on Qt's reflection based on MOC (meta-object compiler)."
LICENSE = "LGPL-2.1+"

PV = "1.2.0"

RPM_NAME = "libinjeqt1-1.2.0-1.28.aarch64.rpm"
RPM_HASH = "4a0f1cc8e438de41399d626bda2b39ff2fca2c49f54ee5928d16fbc0cbb0f6c5a893afe2c79548c792d98e19b18d90fd0464fff2c6b8846e938a3590688eb5e3"

RPROVIDES:${PN} += "libinjeqt.so.1 \
libinjeqt1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
