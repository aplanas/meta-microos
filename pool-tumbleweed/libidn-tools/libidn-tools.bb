SUMMARY = "Command line utility to convert Int. Domain Names"
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

RPM_NAME = "libidn-tools-1.41-1.3.aarch64.rpm"
RPM_HASH = "1ff9c0d520c6fce7748737d6ab98e0ca06e3c7df529ecdc0bbb633a285d7b670ac12d21db5196a42db083d939c9bbd5a35edf30d1af9bc046c15fa311cb4f38e"

RPROVIDES:${PN} += "libidn-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libidn.so.12"

inherit rpm
