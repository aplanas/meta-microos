SUMMARY = "A library for Perl-compatible regular expressions"
DESCRIPTION = "The PCRE library is a set of functions that implement regular \
expression pattern matching using the same syntax and semantics \
as Perl 5."
LICENSE = "BSD-3-Clause"

PV = "8.45"

RPM_NAME = "pcre-doc-8.45-2.6.noarch.rpm"
RPM_HASH = "e10491b6ac660daea0c158d871c3b926e440bf407eb96558fd943b41b6e5ec0b9cbad79741dfeda377052ccf6ec2d6e75b4ac8af6ec99d8c9bc5d1be048ccd76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pcre-doc"

RDEPENDS:${PN} += ""

inherit rpm
