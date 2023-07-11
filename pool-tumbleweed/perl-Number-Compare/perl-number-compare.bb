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

RPM_NAME = "perl-Number-Compare-0.03-11.7.noarch.rpm"
RPM_HASH = "c1dcb1defb6e7e04655b9f32b132954d3f026f37795637da611164e3899a15f02a88a6ef90ce3cd953138de239a2273f46fa25755ec0a3cf868741fb10a1f8df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Number--Compare \
perl-Number-Compare"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
