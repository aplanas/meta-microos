SUMMARY = "Numeric comparisons"
DESCRIPTION = "Number::Compare compiles a simple comparison to an anonymous subroutine, \
which you can call with a value to be tested again. \
 \
Now this would be very pointless, if Number::Compare didn't understand \
magnitudes. \
 \
The target value may use magnitudes of kilobytes ('k', 'ki'), megabytes \
('m', 'mi'), or gigabytes ('g', 'gi'). Those suffixed with an 'i' use the \
appropriate 2**n version in accordance with the IEC standard: \
https://physics.nist.gov/cuu/Units/binary.html"
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PV = "0.03"

RPM_NAME = "perl-Number-Compare-0.03-11.8.noarch.rpm"
RPM_HASH = "bc9c0546ecf164688e8a29ae3b9956f5ca01d36267a75ea69223d706f74ddb3cc6f40e68698aff26e4591c0f39e1d003283605fcb5c38430ac8ce4342a7c4ff9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Number--Compare \
perl-Number-Compare"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
