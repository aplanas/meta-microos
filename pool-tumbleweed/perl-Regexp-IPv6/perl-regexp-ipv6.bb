SUMMARY = "Regular expression for IPv6 addresses"
DESCRIPTION = "This module exports the $IPv6_re regular expression that matches any valid \
IPv6 address as described in 'RFC 2373 - 2.2 Text Representation of \
Addresses' but '::'. Any string not compliant with such RFC will be \
rejected. \
 \
To match full strings use '/^$IPv6_re$/'."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.03"

RPM_NAME = "perl-Regexp-IPv6-0.03-5.28.noarch.rpm"
RPM_HASH = "748e46b6fe3826aadd577dde8ce91237408617ba1acfae5423c2bc61939bdbf2c3cb7af753849fe33301bd4bae6e664e6067fabee3960c2179f816048d1e29df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Regexp--IPv6 \
perl-Regexp-IPv6"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
