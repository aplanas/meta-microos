SUMMARY = "Simple Eyecandy ASCII Tables"
DESCRIPTION = "Simple eyecandy ASCII tables."
LICENSE = "Artistic-2.0"

PV = "2.07"

RPM_NAME = "perl-Text-SimpleTable-2.07-1.12.noarch.rpm"
RPM_HASH = "5cdb84190ac107e42e1c7dc9ff894b74d75983a1960541999d1fa2fa75bd8884534632c23ecc2a732387d31503b795de2ce95e0ef49a0e91659499efcef269ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Text--SimpleTable \
perl-Text-SimpleTable"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
