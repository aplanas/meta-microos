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

RPM_NAME = "opendkim-2.11.0-7.15.aarch64.rpm"
RPM_HASH = "cb160f1a4edaf926c559caa64f84f45a55b4922601723afd150f72c1b90af6c5777f5ea82d02fe86ba387962fe6bc43ad632eacbca6273a4ecb538794232862a"

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
