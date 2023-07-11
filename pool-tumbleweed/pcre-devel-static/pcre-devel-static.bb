SUMMARY = "A library for Perl-compatible regular expressions"
DESCRIPTION = "The PCRE library is a set of functions that implement regular \
expression pattern matching using the same syntax and semantics \
as Perl 5. \
This package contains static versions of the PCRE libraries."
LICENSE = "BSD-3-Clause"

PV = "8.45"

RPM_NAME = "pcre-devel-static-8.45-2.7.aarch64.rpm"
RPM_HASH = "7f422e6fd69c5c9489ab821e8cd67fda6b0e73b157441d24f3e822c1dabf6e341e6af86240a14985915b15a17c9778d54bb8a27c6e26d1dc2fd1a57e53b1e99a"

RPROVIDES:${PN} += "pcre-devel-static"

RDEPENDS:${PN} += "pcre-devel"

inherit rpm
