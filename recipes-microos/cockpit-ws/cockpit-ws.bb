SUMMARY = "Cockpit Web Service"
DESCRIPTION = "The Cockpit Web Service listens on the network, and authenticates users. \
 \
If sssd-dbus is installed, you can enable client certificate/smart card \
authentication via sssd/FreeIPA."
LICENSE = "LGPL-2.1-or-later"

PV = "276.1"

RPM_NAME = "cockpit-ws-276.1-4.3.aarch64.rpm"
RPM_HASH = "d19e3388802df1cab2f0c5414fadb224775d61248795c51c78df142e4683bf9fa43a8d66a7515b1609d793c5a33e636b15fda36027b93d4911bc2b3fd66bb6dd"

RPROVIDES:${PN} += "cockpit-ws cockpit-ws(aarch-64)"
RDEPENDS:${PN} += "(policycoreutils if selinux-policy-targeted) (selinux-policy >= 20230321-1.2 if selinux-policy-targeted) /bin/bash /bin/sh distribution-logos glib-networking glib2 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypt.so.1()(64bit) libcrypt.so.1(XCRYPT_2.0)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgnutls.so.30()(64bit) libgnutls.so.30(GNUTLS_3_4)(64bit) libgobject-2.0.so.0()(64bit) libgssapi_krb5.so.2()(64bit) libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) libjson-glib-1.0.so.0()(64bit) libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) libpam.so.0()(64bit) libpam.so.0(LIBPAM_1.0)(64bit) libpam.so.0(LIBPAM_MODUTIL_1.1.9)(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_209)(64bit) libsystemd.so.0(LIBSYSTEMD_221)(64bit) libsystemd.so.0(LIBSYSTEMD_227)(64bit) libsystemd.so.0(LIBSYSTEMD_237)(64bit) openssl permissions wallpaper-branding"

inherit rpm
