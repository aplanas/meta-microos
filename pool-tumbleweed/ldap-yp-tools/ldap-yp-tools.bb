SUMMARY = "LDAP YP Tools"
DESCRIPTION = "LDAP equivalents of yp tools ypcat, ypmatch and chsh"
LICENSE = "BSD-2-Clause"

PV = "1.13"

RPM_NAME = "ldap-yp-tools-1.13-1.7.aarch64.rpm"
RPM_HASH = "963d2d167b3c1a1fde159414b1f1441e212a2d15e104b427e133ee4ba66cbcbab2451f89f26057fb09bbeb95e383b4cb8bed374141b3125757bf0c38c544c086"

RPROVIDES:${PN} += "ldap-yp-tools \
ldap-yp-tools(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libldap.so.2()(64bit) \
perl \
perl(Net::LDAP) \
perl(URI)"

inherit rpm
