SUMMARY = "System Security Services Daemon"
DESCRIPTION = "Provides a set of daemons to manage access to remote directories and \
authentication mechanisms. It provides an NSS and PAM interface toward \
the system and a pluggable backend system to connect to multiple different \
account sources. It is also the basis to provide client auditing and policy \
services for projects like FreeIPA."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "2.9.0"

RPM_NAME = "sssd-2.9.0-1.1.aarch64.rpm"
RPM_HASH = "121e0cad027e137f63a0c3dbd70ad027f325a9df91743b9c61867c6f02c46265c6b042a0986de1d078e9a75c3048bf752c7ad423b77ee9273b8f649eee7480e5"

RPROVIDES:${PN} += "config(sssd) \
libifp_iface.so()(64bit) \
libifp_iface_sync.so()(64bit) \
libnss_sss.so.2()(64bit) \
libnss_sss.so.2(EXPORTED)(64bit) \
libsss_autofs.so()(64bit) \
libsss_autofs.so(EXPORTED)(64bit) \
libsss_cert.so()(64bit) \
libsss_child.so()(64bit) \
libsss_crypt.so()(64bit) \
libsss_debug.so()(64bit) \
libsss_iface.so()(64bit) \
libsss_iface_sync.so()(64bit) \
libsss_sbus.so()(64bit) \
libsss_sbus_sync.so()(64bit) \
libsss_semanage.so()(64bit) \
libsss_simple.so()(64bit) \
libsss_sudo \
libsss_sudo.so()(64bit) \
libsss_sudo.so(EXPORTED)(64bit) \
libsss_util.so()(64bit) \
libsubid_sss.so()(64bit) \
libsubid_sss.so(EXPORTED)(64bit) \
sssd \
sssd(aarch-64) \
sssd-client"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/env \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcares.so.2()(64bit) \
libcom_err.so.2()(64bit) \
libcrypto.so.3()(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libdhash.so.1()(64bit) \
libgssapi_krb5.so.2()(64bit) \
libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) \
libini_config.so.5()(64bit) \
libjansson.so.4()(64bit) \
libkeyutils.so.1()(64bit) \
libkrad.so.0()(64bit) \
libkrad.so.0(krad_0_MIT)(64bit) \
libkrb5.so.3()(64bit) \
libkrb5.so.3(krb5_3_MIT)(64bit) \
libldb.so.2()(64bit) \
libnl-3.so.200()(64bit) \
libnl-3.so.200(libnl_3)(64bit) \
libnl-route-3.so.200()(64bit) \
libnl-route-3.so.200(libnl_3)(64bit) \
libp11-kit.so.0()(64bit) \
libpam.so.0()(64bit) \
libpcre2-8.so.0()(64bit) \
libpopt.so.0()(64bit) \
libpopt.so.0(LIBPOPT_0)(64bit) \
libref_array.so.1()(64bit) \
libselinux.so.1()(64bit) \
libsemanage.so.2()(64bit) \
libssl.so.3()(64bit) \
libsss_certmap.so.0()(64bit) \
libsss_idmap.so.0()(64bit) \
libsss_nss_idmap.so.0()(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
libtalloc.so.2()(64bit) \
libtdb.so.1()(64bit) \
libtevent.so.0()(64bit) \
libunistring.so.5()(64bit) \
pam-config \
sssd-ldap \
update-alternatives"

inherit rpm
