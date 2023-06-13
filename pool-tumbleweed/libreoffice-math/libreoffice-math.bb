SUMMARY = "LibreOffice Math"
DESCRIPTION = "This module allows you to create and edit scientific formulas and \
equations by using LibreOffice office suite."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-math-7.5.4.1-1.1.aarch64.rpm"
RPM_HASH = "e728a29dab303d9713c24c2ed54c3e758ff5764acc71b4dc9bc3c03b8b4e88fe1b8c4514c602239b7f0d01893cacc51578e17d8a813c07b0ae85c13e89e0cd9c"

RPROVIDES:${PN} += "application() \
application(libreoffice-math.desktop) \
libreoffice-math \
libreoffice-math(aarch-64) \
libsmdlo.so()(64bit) \
libsmlo.so()(64bit) \
mimehandler(application/mathml+xml) \
mimehandler(application/vnd.oasis.opendocument.formula) \
mimehandler(application/vnd.oasis.opendocument.formula-template) \
mimehandler(application/vnd.sun.xml.math) \
mimehandler(text/mathml)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libi18nlangtag.so()(64bit) \
libm.so.6()(64bit) \
libmergedlo.so()(64bit) \
libooxlo.so()(64bit) \
libreoffice \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libuno_cppu.so.3()(64bit) \
libuno_cppu.so.3(LIBO_UDK_4.4)(64bit) \
libuno_cppu.so.3(UDK_3.1)(64bit) \
libuno_cppu.so.3(UDK_3_0_0)(64bit) \
libuno_cppuhelpergcc3.so.3()(64bit) \
libuno_cppuhelpergcc3.so.3(LIBO_UDK_3.9)(64bit) \
libuno_cppuhelpergcc3.so.3(UDK_3.1)(64bit) \
libuno_cppuhelpergcc3.so.3(UDK_3_0_0)(64bit) \
libuno_sal.so.3()(64bit) \
libuno_sal.so.3(LIBO_UDK_3.5)(64bit) \
libuno_sal.so.3(LIBO_UDK_3.6)(64bit) \
libuno_sal.so.3(LIBO_UDK_4.0)(64bit) \
libuno_sal.so.3(LIBO_UDK_4.1)(64bit) \
libuno_sal.so.3(LIBO_UDK_4.2)(64bit) \
libuno_sal.so.3(LIBO_UDK_5.1)(64bit) \
libuno_sal.so.3(LIBO_UDK_5.3)(64bit) \
libuno_sal.so.3(PRIVATE_1.8)(64bit) \
libuno_sal.so.3(UDK_3.1)(64bit) \
libuno_sal.so.3(UDK_3.3)(64bit) \
libuno_sal.so.3(UDK_3.6)(64bit) \
libuno_sal.so.3(UDK_3.8)(64bit) \
libuno_sal.so.3(UDK_3_0_0)(64bit) \
libuno_salhelpergcc3.so.3()(64bit) \
rtld(GNU_HASH)"

inherit rpm
