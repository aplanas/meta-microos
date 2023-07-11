SUMMARY = "LDAP support for the Courier authentication library"
DESCRIPTION = "This package installs LDAP support for the Courier authentication \
library. Install this package in order to be able to authenticate using \
LDAP."
LICENSE = "SUSE-GPL-3.0-with-openssl-exception"

PV = "0.72.0"

RPM_NAME = "courier-authlib-ldap-0.72.0-1.5.aarch64.rpm"
RPM_HASH = "605503e5e0f89d908f21e2d40dc49b00d6f053c0e11b55b6841ab0683809518b7a8abaf621b80c1a47fd3be6fdd6be5321e15640d0781cfd67f729bebd7d39d5"

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
