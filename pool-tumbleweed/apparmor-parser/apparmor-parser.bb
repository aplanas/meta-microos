SUMMARY = "AppArmor userlevel parser utility"
DESCRIPTION = "The AppArmor Parser is a userlevel program that is used to load in \
program profiles to the AppArmor Security kernel module. \
 \
This package is part of a suite of tools that used to be named \
SubDomain."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.6"

RPM_NAME = "apparmor-parser-3.1.6-1.1.aarch64.rpm"
RPM_HASH = "13951bc57afee975f8af94131bfa1eb5634901cfc17c4c7232286e9531d9c925061a03bbfc980368167df7da10375f07c6931320fa49981cc976f770892d7561"

RPROVIDES:${PN} += "apparmor-parser \
apparmor-parser-CAP-SYSLOG \
config-apparmor-parser \
libimnxcert \
subdomain-leaf-cert \
subdomain-parser \
subdomain-parser-common \
subdomain-parser-demo"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
