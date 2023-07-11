SUMMARY = "A library for Perl-compatible regular expressions"
DESCRIPTION = "The PCRE library is a set of functions that implement regular \
expression pattern matching using the same syntax and semantics \
as Perl 5."
LICENSE = "BSD-3-Clause"

PV = "8.45"

RPM_NAME = "pcre-doc-8.45-2.7.noarch.rpm"
RPM_HASH = "99a27df0e9fbdae6c173f18532112cebb869888d950341bc71d1efcb2db1ad358f7fe3414da0416af22252a25d8a4a92ee76952002ac23384e40fca78f3e722e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pcre-doc"

RDEPENDS:${PN} += ""

inherit rpm
