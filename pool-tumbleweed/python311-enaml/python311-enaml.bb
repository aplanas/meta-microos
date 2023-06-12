SUMMARY = "Declarative DSL for building rich user interfaces in Python"
DESCRIPTION = "Enaml is a programming language and framework for creating \
professional quality user interfaces with minimal effort. \
Enaml combines a domain specific declarative language with \
a constraints based layout system to allow users to easily \
define rich UIs with complex and flexible layouts. Enaml \
applications can be run on any platform which supports \
Python and Qt."
LICENSE = "BSD-3-Clause & LGPL-2.1-only"

PV = "0.16.1"

RPM_NAME = "python311-enaml-0.16.1-1.1.aarch64.rpm"
RPM_HASH = "349949ab6ec7f3f867f4142ebe348742cdedf0cc8c8fbc5b4a1101ef19dbbd635b2e9209bf1645768ded8ebb2278bc9c37e6c730ecdcd503a249dd0de524a347"

RPROVIDES:${PN} += "python3.11dist(enaml) \
python311-enaml \
python311-enaml(aarch-64) \
python3dist(enaml)"
RDEPENDS:${PN} += "(python311-qt5 or python311-PyQt6 >= 6.3.1) \
/bin/sh \
/usr/bin/python3.11 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
python(abi) \
python311-QtPy \
python311-atom \
python311-bytecode \
python311-kiwisolver \
python311-ply \
update-alternatives"

inherit rpm
