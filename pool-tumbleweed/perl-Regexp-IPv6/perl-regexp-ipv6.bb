SUMMARY = "Regular expression for IPv6 addresses"
DESCRIPTION = "This module exports the $IPv6_re regular expression that matches any valid \
IPv6 address as described in 'RFC 2373 - 2.2 Text Representation of \
Addresses' but '::'. Any string not compliant with such RFC will be \
rejected. \
 \
To match full strings use '/^$IPv6_re$/'."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.03"

RPM_NAME = "perl-Regexp-IPv6-0.03-5.27.noarch.rpm"
RPM_HASH = "261e79ad302a6dd61c940597b5898551037f30e0145b3d14727203e944f57a5e1ef45660977896d4ae88edd7cc4761474369cc73ee8a507a957725a301bb9b96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Regexp--IPv6 \
perl-Regexp-IPv6"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
