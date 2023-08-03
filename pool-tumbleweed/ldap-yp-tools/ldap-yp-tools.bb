SUMMARY = "LDAP YP Tools"
DESCRIPTION = "LDAP equivalents of yp tools ypcat, ypmatch and chsh"
LICENSE = "BSD-2-Clause"

PV = "1.13"

RPM_NAME = "ldap-yp-tools-1.13-2.1.aarch64.rpm"
RPM_HASH = "cc3080aa6c49cfd0a17a62d5a97629b9fb756018e2eb40a1ccbc06e91e1d8e4db8f4a0612e9f40e8f0ad43ade62c41b6cc0083647e533fbe12c52c0891cea23c"

RPROVIDES:${PN} += "ldap-yp-tools"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libldap.so.2 \
perl \
perl-Net--LDAP \
perl-URI"

inherit rpm
