SUMMARY = "Development files for libidn"
DESCRIPTION = "GNU Libidn is an implementation of the Stringprep, Punycode, and IDNA \
specifications defined by the IETF Internationalized Domain Names (IDN) \
working group. It is used to prepare internationalized strings (such as \
domain name labels, usernames, and passwords) in order to increase the \
likelihood that string input and string comparison work in ways that \
make sense for typical users around the world. The library contains a \
generic Stringprep implementation that does Unicode 3.2 NFKC \
normalization, mapping and prohibition of characters, and bidirectional \
character handling. Profiles for iSCSI, Kerberos 5, Nameprep, SASL, and \
XMPP are included. Punycode and ASCII Compatible Encoding (ACE) via \
IDNA is supported."
LICENSE = "LGPL-2.1-or-later"

PV = "1.41"

RPM_NAME = "libidn-devel-1.41-1.3.aarch64.rpm"
RPM_HASH = "f3d8dba137385ba0795b002d6380c9b0e58f5b4dec6a4190d39b293d807988dd93950ab8f3ca037e857e269e65787d2223ba77dc9000b8aa0b2fe86e7a963337"

RPROVIDES:${PN} += "libidn-devel \
pkgconfig-libidn"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libidn12"

inherit rpm
