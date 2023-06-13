SUMMARY = "LDAP support for the Courier authentication library"
DESCRIPTION = "This package installs LDAP support for the Courier authentication \
library. Install this package in order to be able to authenticate using \
LDAP."
LICENSE = "SUSE-GPL-3.0-with-openssl-exception"

PV = "0.72.0"

RPM_NAME = "courier-authlib-ldap-0.72.0-1.4.aarch64.rpm"
RPM_HASH = "b45b2fe817b58c096c95ba5bb999ee45329ceaa29b91a321310582ee7a788044b46d3e377a1aabf8fe0ab099bcb711d81f0cb2e11a598ce97696ca789403b1db"

RPROVIDES:${PN} += "courier-authlib-ldap \
courier-authlib-ldap(aarch-64) \
libauthldap.so.0()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcourierauth.so.0()(64bit) \
libcourierauthcommon.so.0()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
liblber.so.2()(64bit) \
liblber.so.2(OPENLDAP_2.200)(64bit) \
libldap.so.2()(64bit) \
libldap.so.2(OPENLDAP_2.200)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
