SUMMARY = "AppArmor userlevel parser utility"
DESCRIPTION = "The AppArmor Parser is a userlevel program that is used to load in \
program profiles to the AppArmor Security kernel module. \
 \
This package is part of a suite of tools that used to be named \
SubDomain."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.6"

RPM_NAME = "apparmor-parser-3.1.6-2.2.aarch64.rpm"
RPM_HASH = "bf48b06ddf0f9ca38fe4ea92771ce230fec42d32f904d765c400bf09d8aa7d936826f57adc545981591ec41c71fc2a5749991c35a3656d895fe47563325056b5"

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
