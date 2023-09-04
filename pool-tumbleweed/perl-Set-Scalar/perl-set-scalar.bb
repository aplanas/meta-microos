SUMMARY = "Basic Set Operations"
DESCRIPTION = "basic set operations"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.29"

RPM_NAME = "perl-Set-Scalar-1.29-1.29.noarch.rpm"
RPM_HASH = "a149667922b348e803e2afd5f477ab8264504a151421edc56068da0baa3f33019969fc42e1d7751c8ace11a105e98f1008bef4cacecc6f21caf59463e469ca2f"
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
