SUMMARY = "Google Authenticator PAM module"
DESCRIPTION = "Integrate GOOGLE Authenticator into your login process for full 2FA."
LICENSE = "Apache-2.0"

PV = "1.09"

RPM_NAME = "google-authenticator-libpam-1.09-3.6.aarch64.rpm"
RPM_HASH = "db9f564ec139fda63e49c32f0157441948ba120f66984ac71154bc6252770ba6ffd725611842edd2e235f654ee67652c2cf9d670302de0c283c06d2143fd0f02"

RPROVIDES:${PN} += "google-authenticator-libpam \
google-authenticator-libpam(aarch-64) \
pam-google-authenticator"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libpam.so.0()(64bit)"

inherit rpm
