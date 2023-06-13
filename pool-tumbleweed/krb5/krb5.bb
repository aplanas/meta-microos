SUMMARY = "MIT Kerberos5 implementation"
DESCRIPTION = "Kerberos V5 is a trusted-third-party network authentication system, \
which can improve network security by eliminating the insecure \
practice of clear text passwords."
LICENSE = "MIT"

PV = "1.20.1"

RPM_NAME = "krb5-1.20.1-6.1.aarch64.rpm"
RPM_HASH = "eb15982aecfaa4dac81bee1128dcd80ec1f826ba7cfae78710eea0e42058abe83a8e543668b643effa838b6971f898b7c3fa4abd6e80ca30215a0ac676296db1"

RPROVIDES:${PN} += "config(krb5) \
krb5 \
krb5(aarch-64) \
libgssapi_krb5.so.2()(64bit) \
libgssapi_krb5.so.2(HIDDEN)(64bit) \
libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) \
libgssrpc.so.4()(64bit) \
libgssrpc.so.4(HIDDEN)(64bit) \
libgssrpc.so.4(gssrpc_4_MIT)(64bit) \
libk5crypto.so.3()(64bit) \
libk5crypto.so.3(HIDDEN)(64bit) \
libk5crypto.so.3(k5crypto_3_MIT)(64bit) \
libkadm5clnt_mit.so.12()(64bit) \
libkadm5clnt_mit.so.12(HIDDEN)(64bit) \
libkadm5clnt_mit.so.12(kadm5clnt_mit_12_MIT)(64bit) \
libkadm5srv_mit.so.12()(64bit) \
libkadm5srv_mit.so.12(HIDDEN)(64bit) \
libkadm5srv_mit.so.12(kadm5srv_mit_12_MIT)(64bit) \
libkdb5.so.10()(64bit) \
libkdb5.so.10(HIDDEN)(64bit) \
libkdb5.so.10(kdb5_10_MIT)(64bit) \
libkrad.so.0()(64bit) \
libkrad.so.0(HIDDEN)(64bit) \
libkrad.so.0(krad_0_MIT)(64bit) \
libkrb5.so.3()(64bit) \
libkrb5.so.3(HIDDEN)(64bit) \
libkrb5.so.3(krb5_3_MIT)(64bit) \
libkrb5support.so.0()(64bit) \
libkrb5support.so.0(HIDDEN)(64bit) \
libkrb5support.so.0(krb5support_0_MIT)(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcom_err.so.2()(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libkeyutils.so.1()(64bit) \
libkeyutils.so.1(KEYUTILS_0.3)(64bit) \
libkeyutils.so.1(KEYUTILS_1.0)(64bit) \
libkeyutils.so.1(KEYUTILS_1.5)(64bit) \
libresolv.so.2()(64bit) \
libresolv.so.2(GLIBC_2.17)(64bit) \
libselinux.so.1()(64bit) \
libselinux.so.1(LIBSELINUX_1.0)(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
libverto.so.1()(64bit)"

inherit rpm
