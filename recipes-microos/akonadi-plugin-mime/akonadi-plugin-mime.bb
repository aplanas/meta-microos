SUMMARY = "MIME email parser for KDE PIM - runtime plugins"
DESCRIPTION = "This package provides plugins required by PIM applications read and write parsed \
email data."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "akonadi-plugin-mime-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "aaaa580b9e2b85ebd3217fd8050418cea403c0661558c01e2a992073affb7d27fe431b622dc55f1090c125f8ba5a8e29a6e9a20ace26ef30120aa6b2badaaf11"

RPROVIDES:${PN} += "akonadi-plugin-mime \
akonadi-plugin-mime(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKPim5AkonadiCore.so.5()(64bit) \
libKPim5AkonadiMime.so.5()(64bit) \
libKPim5AkonadiMime5 \
libKPim5AkonadiPrivate.so.5()(64bit) \
libKPim5Mime.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
