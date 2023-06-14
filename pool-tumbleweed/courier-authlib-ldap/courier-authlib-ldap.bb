SUMMARY = "LDAP support for the Courier authentication library"
DESCRIPTION = "This package installs LDAP support for the Courier authentication \
library. Install this package in order to be able to authenticate using \
LDAP."
LICENSE = "SUSE-GPL-3.0-with-openssl-exception"

PV = "0.72.0"

RPM_NAME = "courier-authlib-ldap-0.72.0-1.4.aarch64.rpm"
RPM_HASH = "b45b2fe817b58c096c95ba5bb999ee45329ceaa29b91a321310582ee7a788044b46d3e377a1aabf8fe0ab099bcb711d81f0cb2e11a598ce97696ca789403b1db"

RPROVIDES:${PN} += "courier-authlib-ldap \
libauthldap.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcourierauth.so.0 \
libcourierauthcommon.so.0 \
libgcc-s.so.1 \
liblber.so.2 \
libldap.so.2 \
libstdc++.so.6"

inherit rpm
