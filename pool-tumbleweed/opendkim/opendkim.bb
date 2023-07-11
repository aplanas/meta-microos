SUMMARY = "Milter based implementation of DKIM"
DESCRIPTION = "DomainKeys Identified Mail (DKIM) lets an organization take responsibility for \
a message that is in transit.  The organization is a handler of the message, \
either as its originator or as an intermediary. Their reputation is the basis \
for evaluating whether to trust the message for further handling, such as \
delivery. Technically DKIM provides a method for validating a domain name \
identity that is associated with a message through cryptographic \
authentication."
LICENSE = "BSD-3-Clause & Sendmail"

PV = "2.11.0"

RPM_NAME = "opendkim-2.11.0-7.16.aarch64.rpm"
RPM_HASH = "99ff36fb58d478c6e02d00c03a6f988585622db4cf88c3b1f23874bfe26ce2df636e1f1abfb702bcf25cfdd1ca7c8ecdb83b05ee453eaff81f5fae99378ae778"

RPROVIDES:${PN} += "config-opendkim \
opendkim"

RDEPENDS:${PN} += "/usr/bin/openssl \
/usr/bin/perl \
/usr/bin/sh \
/usr/sbin/groupadd \
/usr/sbin/useradd \
ld-linux-aarch64.so.1 \
libbsd.so.0 \
libc.so.6 \
libcrypto.so.3 \
libdb-4.8.so \
liblber.so.2 \
libldap.so.2 \
liblua5.1.so.5 \
libmemcached.so.11 \
libmilter.so.1.0 \
libopendkim.so.11 \
librbl.so.1 \
librepute.so.1 \
libssl.so.3 \
libunbound.so.8 \
libvbr.so.2"

inherit rpm
