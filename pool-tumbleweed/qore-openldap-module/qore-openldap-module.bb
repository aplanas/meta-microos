SUMMARY = "OPENLDAP module for Qore"
DESCRIPTION = "This package contains the openldap module for the Qore Programming Language. \
 \
This module exposes functionality from the openldap library as a Qore API."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "1.2"

RPM_NAME = "qore-openldap-module-1.2-1.3.aarch64.rpm"
RPM_HASH = "403bba4f5a107376006ea1c994dc3a681f062388699b688ea35e673c3d671344c5d57a36f4eb890bd4688eeea90bc16e7f90944cc91f0b377684245091686747"

RPROVIDES:${PN} += "qore-openldap-module \
qore-openldap-module(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/env \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libldap.so.2()(64bit) \
libldap.so.2(OPENLDAP_2.200)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
qore-module(abi)(aarch-64)"

inherit rpm
