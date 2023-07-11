SUMMARY = "Basic Set Operations"
DESCRIPTION = "basic set operations"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.29"

RPM_NAME = "perl-Set-Scalar-1.29-1.28.noarch.rpm"
RPM_HASH = "feb6c2e5491d9360c291f418d892e827d0b0fa30e865bbe139886aa396d02f459eaf89ff3d0417083586e09f111dc7f418db24396a6d6972372afefabd5074d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Set--Scalar \
perl-Set--Scalar--Base \
perl-Set--Scalar--Null \
perl-Set--Scalar--Real \
perl-Set--Scalar--Universe \
perl-Set--Scalar--Valued \
perl-Set--Scalar--ValuedUniverse \
perl-Set--Scalar--Virtual \
perl-Set-Scalar"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
