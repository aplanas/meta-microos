SUMMARY = "PAM module to disallow weak new passwords"
DESCRIPTION = "The pam_pwquality PAM module can be used instead of pam_cracklib to \
disallow weak new passwords when user's login password is changed."
LICENSE = "BSD-3-Clause | GPL-2.0-or-later"

PV = "1.4.5"

RPM_NAME = "pam_pwquality-1.4.5-1.2.aarch64.rpm"
RPM_HASH = "803fe6357f39d2c42f79ae9d151cd0bf842c73ff7ac52222ff8236dded7ce235ca0b311a9b37ae85b619f75765af0fc2f514a5a5e68bd435ab7c9610b8e7e194"

RPROVIDES:${PN} += "pam-pwquality"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpam.so.0 \
libpwquality.so.1 \
pam \
pam-config"

inherit rpm
