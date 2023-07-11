SUMMARY = "OTP preauthentication plugin for MIT Kerberos5"
DESCRIPTION = "Kerberos V5 is a trusted-third-party network authentication system, \
which can improve network security by eliminating the insecure \
practice of cleartext passwords. This package includes a OTP plugin."
LICENSE = "MIT"

PV = "1.20.1"

RPM_NAME = "krb5-plugin-preauth-otp-1.20.1-6.2.aarch64.rpm"
RPM_HASH = "d000f0abd77974a7ac07b6e37716ae074ced4f3dae7c7411c752ac0fecae82defa1a26d5a207c02da658369c05073fce1187521dc565cb9945bc0e68f2c48b50"

RPROVIDES:${PN} += "krb5-plugin-preauth-otp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcom-err.so.2 \
libk5crypto.so.3 \
libkrad.so.0 \
libkrb5.so.3 \
libkrb5support.so.0"

inherit rpm
