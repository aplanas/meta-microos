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

RPM_NAME = "libidn-devel-1.41-1.2.aarch64.rpm"
RPM_HASH = "1e5b4b877797575729869425b2afcdd8572749c6af55d8f6dab5d94bc0c7503d3f1426005f21bf8e2c8a20df2c1d889a4153d198ddfca4b69c3cef8a26f43e5b"

RPROVIDES:${PN} += "libidn-devel \
libidn-devel(aarch-64) \
pkgconfig(libidn)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libidn12"

inherit rpm
