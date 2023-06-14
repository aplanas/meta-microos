SUMMARY = "A library for Perl-compatible regular expressions"
DESCRIPTION = "The PCRE library is a set of functions that implement regular \
expression pattern matching using the same syntax and semantics \
as Perl 5. \
This package contains static versions of the PCRE libraries."
LICENSE = "BSD-3-Clause"

PV = "8.45"

RPM_NAME = "pcre-devel-static-8.45-2.6.aarch64.rpm"
RPM_HASH = "c581dde91ea491515b4fdbbd52b052974e7fec4bdd22a11820034530a2c07bfa27fc43a96aa99625e3b1fb872faeb9d8a638b68aff053fe9166fa28e16f8a99d"

RPROVIDES:${PN} += "pcre-devel-static"

RDEPENDS:${PN} += "pcre-devel"

inherit rpm
