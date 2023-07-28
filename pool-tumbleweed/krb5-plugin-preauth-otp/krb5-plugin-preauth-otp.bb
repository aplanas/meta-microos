SUMMARY = "OTP preauthentication plugin for MIT Kerberos5"
DESCRIPTION = "Kerberos V5 is a trusted-third-party network authentication system, \
which can improve network security by eliminating the insecure \
practice of cleartext passwords. This package includes a OTP plugin."
LICENSE = "MIT"

PV = "1.21.1"

RPM_NAME = "krb5-plugin-preauth-otp-1.21.1-1.1.aarch64.rpm"
RPM_HASH = "bb2b5d8a1a3b664c40eecd0ebe7b486df8fbe5279828207ff10f1a76a44db3b3a271ef4f70da68697b0e3df6ea2176994465f06a28799eb9f7ee30e4aa81702c"

RPROVIDES:${PN} += "krb5-plugin-preauth-otp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcom-err.so.2 \
libk5crypto.so.3 \
libkrad.so.0 \
libkrb5.so.3 \
libkrb5support.so.0"

inherit rpm
