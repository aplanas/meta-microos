SUMMARY = "Dependency injection framework for Qt"
DESCRIPTION = "injeqt is an attempt to build a powerful and reliable dependency injection \
framework on Qt's reflection based on MOC (meta-object compiler)."
LICENSE = "LGPL-2.1+"

PV = "1.2.0"

RPM_NAME = "libinjeqt1-1.2.0-1.28.aarch64.rpm"
RPM_HASH = "4a0f1cc8e438de41399d626bda2b39ff2fca2c49f54ee5928d16fbc0cbb0f6c5a893afe2c79548c792d98e19b18d90fd0464fff2c6b8846e938a3590688eb5e3"

RPROVIDES:${PN} += "libinjeqt.so.1()(64bit) \
libinjeqt1 \
libinjeqt1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
