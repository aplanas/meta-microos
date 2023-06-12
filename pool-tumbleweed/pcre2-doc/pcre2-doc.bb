SUMMARY = "A library for Perl-compatible regular expressions"
DESCRIPTION = "The PCRE2 library is a set of functions that implement regular \
expression pattern matching using the same syntax and semantics \
as Perl 5. \
 \
PCRE2 is a re-working of the original PCRE library to provide an entirely new \
API."
LICENSE = "BSD-3-Clause"

PV = "10.42"

RPM_NAME = "pcre2-doc-10.42-3.3.noarch.rpm"
RPM_HASH = "776b4c11e2f79fe47818abb4855bbe871322a682fe1d69682142aa41e7155eaca3a48a11d7d7253a4f563d35171c460fd8d7f28765ad0501ac83980e55d02953"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pcre2-doc"
RDEPENDS:${PN} += ""

inherit rpm
