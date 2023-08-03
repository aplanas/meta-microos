SUMMARY = "AppArmor userlevel parser utility"
DESCRIPTION = "The AppArmor Parser is a userlevel program that is used to load in \
program profiles to the AppArmor Security kernel module. \
 \
This package is part of a suite of tools that used to be named \
SubDomain."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.6"

RPM_NAME = "apparmor-parser-3.1.6-2.1.aarch64.rpm"
RPM_HASH = "6f5d37e28512aa689ba9a7f75fff9a69c701fefaf7b938b44a8de9dfc48ddfd8f10a659b67c2e6ef64112cb1da9bcb90ca116b5dc77ab30888d3f6162094ff55"

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
