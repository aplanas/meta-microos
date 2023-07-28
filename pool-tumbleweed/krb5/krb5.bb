SUMMARY = "MIT Kerberos5 implementation"
DESCRIPTION = "Kerberos V5 is a trusted-third-party network authentication system, \
which can improve network security by eliminating the insecure \
practice of clear text passwords."
LICENSE = "MIT"

PV = "1.21.1"

RPM_NAME = "krb5-1.21.1-1.1.aarch64.rpm"
RPM_HASH = "fe662fc8e06af4e52d69d7d5879dbb2c8f0505671de109ec2fd308269808c7b053caf671d287f904a3ab0c63fc5b76a950c13159f2905f718d267e9fa64939a5"

RPROVIDES:${PN} += "config-krb5 \
krb5 \
libgssapi-krb5.so.2 \
libgssrpc.so.4 \
libk5crypto.so.3 \
libkadm5clnt-mit.so.12 \
libkadm5srv-mit.so.12 \
libkdb5.so.10 \
libkrad.so.0 \
libkrb5.so.3 \
libkrb5support.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcom-err.so.2 \
libcrypto.so.3 \
libkeyutils.so.1 \
libresolv.so.2 \
libselinux.so.1 \
libssl.so.3 \
libverto.so.1"

inherit rpm
