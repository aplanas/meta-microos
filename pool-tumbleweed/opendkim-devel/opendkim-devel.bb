SUMMARY = "Development files to develop with opendkim"
DESCRIPTION = "DomainKeys Identified Mail (DKIM) lets an organization take responsibility for \
a message that is in transit.  The organization is a handler of the message, \
either as its originator or as an intermediary. Their reputation is the basis \
for evaluating whether to trust the message for further handling, such as \
delivery. Technically DKIM provides a method for validating a domain name \
identity that is associated with a message through cryptographic \
authentication. \
 \
This package holds the development files."
LICENSE = "BSD-3-Clause & Sendmail"

PV = "2.11.0"

RPM_NAME = "opendkim-devel-2.11.0-7.15.aarch64.rpm"
RPM_HASH = "63d344c7f9fb1ab8b78f042380e20ff3eb67739630c6f5a0d38ea9fc6fd27580f9953e9e074adb4184e4e9ec8361a09ae4338437ab585cd05065618c1dc5985b"

RPROVIDES:${PN} += "opendkim-devel \
opendkim-devel(aarch-64) \
pkgconfig(opendkim) \
pkgconfig(rbl) \
pkgconfig(repute) \
pkgconfig(ut) \
pkgconfig(vbr)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libopendkim11 \
librbl1 \
librepute1 \
libut1 \
libvbr2 \
opendkim"

inherit rpm
