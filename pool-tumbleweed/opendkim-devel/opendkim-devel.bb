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

RPM_NAME = "opendkim-devel-2.11.0-7.16.aarch64.rpm"
RPM_HASH = "ff6ade695183946d4f444fe6f1c8f39a3e4a24dd8e4bfc1f253314716e8eadfffa166d131062fa43894a4edaeb1bf94c26e3f50feb0f0184bd441686b5696eba"

RPROVIDES:${PN} += "opendkim-devel \
pkgconfig-opendkim \
pkgconfig-rbl \
pkgconfig-repute \
pkgconfig-ut \
pkgconfig-vbr"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libopendkim11 \
librbl1 \
librepute1 \
libut1 \
libvbr2 \
opendkim"

inherit rpm
