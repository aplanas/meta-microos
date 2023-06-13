SUMMARY = "SPAKE preauthentication plugin for MIT Kerberos5"
DESCRIPTION = "Kerberos V5 is a trusted-third-party network authentication system, \
which can improve network security by eliminating the insecure \
practice of cleartext passwords. This package includes a SPAKE plugin."
LICENSE = "MIT"

PV = "1.20.1"

RPM_NAME = "krb5-plugin-preauth-spake-1.20.1-6.1.aarch64.rpm"
RPM_HASH = "7efaff1e6b897ab101034bf8146fa9ec590981d1b6608e55b1634fcf0738c19660d742719338cd169409e9d65d584f52f733fa2e407bb9ddcb1da3dec8f7f214"

RPROVIDES:${PN} += "krb5-plugin-preauth-spake \
krb5-plugin-preauth-spake(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libk5crypto.so.3()(64bit) \
libk5crypto.so.3(k5crypto_3_MIT)(64bit) \
libkrb5.so.3()(64bit) \
libkrb5.so.3(krb5_3_MIT)(64bit) \
libkrb5support.so.0()(64bit) \
libkrb5support.so.0(krb5support_0_MIT)(64bit)"

inherit rpm
