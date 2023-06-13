SUMMARY = "The Linux Audio Developer's Simple Plug-In API"
DESCRIPTION = "The Linux Audio Developer's Simple Plug-in API (LADSPA) provides the \
ability to write simple plug-in audio processors in C/C++ and link them \
dynamically.  This package contains the plugins built from LADSPA SDK."
LICENSE = "LGPL-2.1-or-later"

PV = "1.17"

RPM_NAME = "ladspa-1.17-1.8.aarch64.rpm"
RPM_HASH = "d40a5afcb30a705d0ab709cec89a6c4b09c6a8e0dc930cb58ce0a4444eff85615abf1bef37f6c59f173fb88ec091155758c552db9fcc384ab9d1b64cc5b2c38b"

RPROVIDES:${PN} += "ladspa \
ladspa(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libsndfile.so.1()(64bit) \
libsndfile.so.1(libsndfile.so.1.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
