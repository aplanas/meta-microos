SUMMARY = "AppArmor userlevel parser utility"
DESCRIPTION = "The AppArmor Parser is a userlevel program that is used to load in \
program profiles to the AppArmor Security kernel module. \
 \
This package is part of a suite of tools that used to be named \
SubDomain."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.3"

RPM_NAME = "apparmor-parser-3.1.3-2.1.aarch64.rpm"
RPM_HASH = "28ab364a6248e6de59ae7c0df84e85befc07411747812d022d87ef1a431bd3b127855c11dbb5d1c403aeeba746d4b670a52cd183bfa52336082d92137a3d6d37"

RPROVIDES:${PN} += "apparmor-parser apparmor-parser(CAP_SYSLOG) apparmor-parser(aarch-64) config(apparmor-parser) libimnxcert subdomain-leaf-cert subdomain-parser subdomain-parser-common subdomain-parser-demo subdomain_parser"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.36)(64bit) libm.so.6()(64bit)"

inherit rpm
