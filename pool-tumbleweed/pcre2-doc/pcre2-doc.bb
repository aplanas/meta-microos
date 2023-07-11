SUMMARY = "A library for Perl-compatible regular expressions"
DESCRIPTION = "The PCRE2 library is a set of functions that implement regular \
expression pattern matching using the same syntax and semantics \
as Perl 5. \
 \
PCRE2 is a re-working of the original PCRE library to provide an entirely new \
API."
LICENSE = "BSD-3-Clause"

PV = "10.42"

RPM_NAME = "pcre2-doc-10.42-3.5.noarch.rpm"
RPM_HASH = "145dae0a4dd3d3be1f6e2fa8dbdb1ab0732fd7ec1467ac1be05bf05ec718d84541f45e25d82dd8400fe303b8cad1371665b3c7c8fdd3f22a9c62351818c79aef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pcre2-doc"

RDEPENDS:${PN} += ""

inherit rpm
