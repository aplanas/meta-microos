SUMMARY = "AppArmor userlevel parser utility"
DESCRIPTION = "The AppArmor Parser is a userlevel program that is used to load in \
program profiles to the AppArmor Security kernel module. \
 \
This package is part of a suite of tools that used to be named \
SubDomain."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.4"

RPM_NAME = "apparmor-parser-3.1.4-1.1.aarch64.rpm"
RPM_HASH = "03500d85a6568a154d5563c2c2d677f17a6f3ab984186d387edba83fb5835dd046b56fa3d5fbeb6d757c0f2871503b2374bb3088e346336378bd1475c7ba7445"

RPROVIDES:${PN} += "apparmor-parser \
apparmor-parser(CAP_SYSLOG) \
apparmor-parser(aarch-64) \
config(apparmor-parser) \
libimnxcert \
subdomain-leaf-cert \
subdomain-parser \
subdomain-parser-common \
subdomain-parser-demo \
subdomain_parser"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.36)(64bit) \
libm.so.6()(64bit)"

inherit rpm
