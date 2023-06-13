SUMMARY = "OTP preauthentication plugin for MIT Kerberos5"
DESCRIPTION = "Kerberos V5 is a trusted-third-party network authentication system, \
which can improve network security by eliminating the insecure \
practice of cleartext passwords. This package includes a OTP plugin."
LICENSE = "MIT"

PV = "1.20.1"

RPM_NAME = "krb5-plugin-preauth-otp-1.20.1-6.1.aarch64.rpm"
RPM_HASH = "45e052da630c6cff4b419b9e4a32d768d2333484d53a6dd65024b460c6f3a6941493d49ec5126cc94195d514da7a221da01f4f7f193f9b77f097b58a042ee8b5"

RPROVIDES:${PN} += "krb5-plugin-preauth-otp \
krb5-plugin-preauth-otp(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcom_err.so.2()(64bit) \
libk5crypto.so.3()(64bit) \
libk5crypto.so.3(k5crypto_3_MIT)(64bit) \
libkrad.so.0()(64bit) \
libkrad.so.0(krad_0_MIT)(64bit) \
libkrb5.so.3()(64bit) \
libkrb5.so.3(krb5_3_MIT)(64bit) \
libkrb5support.so.0()(64bit) \
libkrb5support.so.0(krb5support_0_MIT)(64bit)"

inherit rpm
