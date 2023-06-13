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

RPROVIDES:${PN} += "config(opendkim) \
opendkim \
opendkim(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/openssl \
/usr/bin/perl \
/usr/sbin/groupadd \
/usr/sbin/useradd \
ld-linux-aarch64.so.1()(64bit) \
libbsd.so.0()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libdb-4.8.so()(64bit) \
liblber.so.2()(64bit) \
libldap.so.2()(64bit) \
liblua5.1.so.5()(64bit) \
libmemcached.so.11()(64bit) \
libmilter.so.1.0()(64bit) \
libopendkim.so.11()(64bit) \
librbl.so.1()(64bit) \
librepute.so.1()(64bit) \
libssl.so.3()(64bit) \
libunbound.so.8()(64bit) \
libvbr.so.2()(64bit)"

inherit rpm
