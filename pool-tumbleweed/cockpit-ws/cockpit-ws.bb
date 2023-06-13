SUMMARY = "Cockpit Web Service"
DESCRIPTION = "The Cockpit Web Service listens on the network, and authenticates users. \
 \
If sssd-dbus is installed, you can enable client certificate/smart card \
authentication via sssd/FreeIPA."
LICENSE = "LGPL-2.1-or-later"

PV = "276.1"

RPM_NAME = "cockpit-ws-276.1-4.4.aarch64.rpm"
RPM_HASH = "5c2a3638c84653332424bae77b8b4911d99da062417ae2c5cad819e0d32f133a069d33579564923498319a6c688488b739f19b98707fb10e492a32a149396797"

RPROVIDES:${PN} += "cockpit-ws \
cockpit-ws(aarch-64)"

RDEPENDS:${PN} += "(policycoreutils if selinux-policy-targeted) \
(selinux-policy >= 20230425-1.1 if selinux-policy-targeted) \
/bin/bash \
/bin/sh \
distribution-logos \
glib-networking \
glib2 \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypt.so.1()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
libgobject-2.0.so.0()(64bit) \
libgssapi_krb5.so.2()(64bit) \
libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) \
libjson-glib-1.0.so.0()(64bit) \
libpam.so.0()(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
libsystemd.so.0(LIBSYSTEMD_221)(64bit) \
libsystemd.so.0(LIBSYSTEMD_227)(64bit) \
libsystemd.so.0(LIBSYSTEMD_237)(64bit) \
openssl \
permissions \
wallpaper-branding"

inherit rpm
