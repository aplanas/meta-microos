SUMMARY = "Facility for creating read-only scalars, arrays, hashes"
DESCRIPTION = "Facility for creating read-only scalars, arrays, hashes"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "2.05"

RPM_NAME = "perl-Readonly-2.05-1.22.noarch.rpm"
RPM_HASH = "7b53c2c0a64cc5d01b4f1c3d39a7d32488e0b98f8028848196ea0fec4753868f46ed048a880f909553ee1a0d6f94a2e560e8f9a5092ff95f963521dd0f18c7c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Readonly \
perl-Readonly--Array \
perl-Readonly--Hash \
perl-Readonly--Scalar"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm
