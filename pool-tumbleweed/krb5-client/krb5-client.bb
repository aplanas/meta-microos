SUMMARY = "Client programs of the MIT Kerberos5 implementation"
DESCRIPTION = "Kerberos V5 is a trusted-third-party network authentication system, \
which can improve network security by eliminating the insecure \
practice of cleartext passwords. This package includes some required \
client programs, like kinit, kadmin, ..."
LICENSE = "MIT"

PV = "1.20.1"

RPM_NAME = "krb5-client-1.20.1-6.1.aarch64.rpm"
RPM_HASH = "99bdf1fa951f65ce325b6f7affab6db897376b64e4f06b693845dc5767a9f8e548b71e586785030a0a89699d7cfcae28e25927dbb837e9c2724005f813ac860e"

RPROVIDES:${PN} += "krb5-client \
krb5-client(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcom_err.so.2()(64bit) \
libgssapi_krb5.so.2()(64bit) \
libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) \
libk5crypto.so.3()(64bit) \
libk5crypto.so.3(k5crypto_3_MIT)(64bit) \
libkadm5clnt_mit.so.12()(64bit) \
libkadm5clnt_mit.so.12(kadm5clnt_mit_12_MIT)(64bit) \
libkadm5srv_mit.so.12()(64bit) \
libkadm5srv_mit.so.12(kadm5srv_mit_12_MIT)(64bit) \
libkdb5.so.10()(64bit) \
libkdb5.so.10(kdb5_10_MIT)(64bit) \
libkrb5.so.3()(64bit) \
libkrb5.so.3(krb5_3_MIT)(64bit) \
libkrb5support.so.0()(64bit) \
libkrb5support.so.0(krb5support_0_MIT)(64bit) \
libpam.so.0()(64bit) \
libpam.so.0(LIBPAM_1.0)(64bit) \
libss.so.2()(64bit)"

inherit rpm
