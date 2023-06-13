SUMMARY = "SCIM module for Ecore"
DESCRIPTION = "SCIM input method module for Ecore."
LICENSE = "BSD-2-Clause"

PV = "1.26.3"

RPM_NAME = "ecore_imf-module-scim-1.26.3-30.6.aarch64.rpm"
RPM_HASH = "26dee629032671c380c833cc7c59ddacc026ea92a03e1d0cd1f9eeba7e54ac0455d340228d04bd9e5a5083ccf27779d137e45136552663b3d131f7155bc44c2d"

RPROVIDES:${PN} += "ecore_imf-module-scim \
ecore_imf-module-scim(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libecore.so.1()(64bit) \
libecore_evas.so.1()(64bit) \
libecore_imf.so.1()(64bit) \
libecore_x.so.1()(64bit) \
libeina.so.1()(64bit) \
libevas.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libscim-1.0.so.8()(64bit) \
libscim-1.0.so.8(LIBSCIM_1.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
