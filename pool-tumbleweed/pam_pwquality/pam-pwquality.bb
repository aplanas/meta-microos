SUMMARY = "PAM module to disallow weak new passwords"
DESCRIPTION = "The pam_pwquality PAM module can be used instead of pam_cracklib to \
disallow weak new passwords when user's login password is changed."
LICENSE = "BSD-3-Clause | GPL-2.0-or-later"

PV = "1.4.5"

RPM_NAME = "pam_pwquality-1.4.5-1.3.aarch64.rpm"
RPM_HASH = "a81e9e5f67d290735c2824e9dee9d6ecfe0bee10c97829849c9f97cfe31f6bc91ed39dac01a57351e17678c70eed049bc4be911236f44218531d106817861658"

RPROVIDES:${PN} += "pam-pwquality"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpam.so.0 \
libpwquality.so.1 \
pam \
pam-config"

inherit rpm
