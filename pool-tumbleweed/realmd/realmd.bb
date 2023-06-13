SUMMARY = "AD integration detection"
DESCRIPTION = "This packages contains realmd. \
 \
Realmd is an on demand system DBus service, which allows \
callers to configure network authentication and domain \
membership in a standard way. realmd discovers information \
about the domain or realm automatically and does not require \
complicated configuration in order to join a domain or realm. \
 \
realmd configures sssd or winbind to do the actual network \
authentication and user account lookups."
LICENSE = "LGPL-2.1-or-later"

PV = "0.17.1"

RPM_NAME = "realmd-0.17.1-1.3.aarch64.rpm"
RPM_HASH = "2ca15960584585b1466a3aacd529b8cb32bc1dc73a381018476df25e9cfb82f226c7fe1f4d049252ba070ab16c17f72f6b00c466a39edf456f3b57193197adff"

RPROVIDES:${PN} += "config(realmd) \
realmd \
realmd(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libkrb5.so.3()(64bit) \
libkrb5.so.3(krb5_3_MIT)(64bit) \
liblber.so.2()(64bit) \
liblber.so.2(OPENLDAP_2.200)(64bit) \
libldap.so.2()(64bit) \
libldap.so.2(OPENLDAP_2.200)(64bit) \
libpolkit-gobject-1.so.0()(64bit) \
systemd"

inherit rpm
