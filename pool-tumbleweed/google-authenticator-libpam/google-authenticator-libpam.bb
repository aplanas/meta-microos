SUMMARY = "Google Authenticator PAM module"
DESCRIPTION = "Integrate GOOGLE Authenticator into your login process for full 2FA."
LICENSE = "Apache-2.0"

PV = "1.09"

RPM_NAME = "google-authenticator-libpam-1.09-3.7.aarch64.rpm"
RPM_HASH = "9403ace491ca8e8cf5ed6f4a39d398ecf2c19ead9a8be54d1d8054597573cc1b3fa323bbe4e1d404a09e683c14ee56083f3ca9efc83c0db32b37010c6d359f92"

RPROVIDES:${PN} += "google-authenticator-libpam \
pam-google-authenticator"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpam.so.0"

inherit rpm
