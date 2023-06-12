SUMMARY = "Support for Internationalized Domain Names (IDN)"
DESCRIPTION = "GNU Libidn is an implementation of the Stringprep, Punycode, and IDNA \
specifications defined by the IETF Internationalized Domain Names \
(IDN) working group. It is used to prepare internationalized strings \
(such as domain name labels, usernames, and passwords) in order to \
increase the likelihood that string input and string comparison work \
in ways that make sense for typical users around the world. The \
library contains a generic Stringprep implementation that does \
Unicode 3.2 NFKC normalization, mapping and prohibition of \
characters, and bidirectional character handling. Profiles for iSCSI, \
Kerberos 5, Nameprep, SASL, and XMPP are included. Punycode and ASCII \
Compatible Encoding (ACE) via IDNA is supported."
LICENSE = "(GPL-2.0-or-later | LGPL-3.0-or-later) & GPL-3.0-or-later"

PV = "1.41"

RPM_NAME = "libidn12-1.41-1.2.aarch64.rpm"
RPM_HASH = "fc7a1a3a321a0a3012be63c9a254e338c1ecdfc394ef2b0e8e03045c6b73f72e47f9700fdc2b35e0c88272f5d4b468ef14af720db0af3c2075175dbb771a528a"

RPROVIDES:${PN} += "libidn \
libidn.so.12()(64bit) \
libidn.so.12(LIBIDN_1.0)(64bit) \
libidn12 \
libidn12(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
