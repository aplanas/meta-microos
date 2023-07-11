SUMMARY = "A library for Perl-compatible regular expressions"
DESCRIPTION = "The PCRE2 library is a set of functions that implement regular \
expression pattern matching using the same syntax and semantics \
as Perl 5. \
 \
PCRE2 is a re-working of the original PCRE library to provide an entirely new \
API. \
 \
This package contains static versions of the PCRE2 libraries."
LICENSE = "BSD-3-Clause"

PV = "10.42"

RPM_NAME = "pcre2-devel-static-10.42-3.5.aarch64.rpm"
RPM_HASH = "2e965f854f2ba091384bfaf307ba2e38378463460f366f4af55a1731aaf9a8504a7ecfe0d39b880589fbd9279adac95afafa3136e2a381ae9a7ea710f651b0e1"

RPROVIDES:${PN} += "pcre2-devel-static"

RDEPENDS:${PN} += "pcre2-devel"

inherit rpm
