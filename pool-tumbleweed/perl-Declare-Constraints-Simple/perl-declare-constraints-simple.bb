SUMMARY = "Declarative Validation of Data Structures"
DESCRIPTION = "The main purpose of this module is to provide an easy way to build a \
profile to validate a data structure. It does this by giving you a set of \
declarative keywords in the importing namespace."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.03"

RPM_NAME = "perl-Declare-Constraints-Simple-0.03-16.21.noarch.rpm"
RPM_HASH = "c92cd19d90b5817f0405b15612ce8e8a0e02ae89ef97a5609890e40643dd31c3401d8d961a185e65e1727174dc36583c679c2a1405afcebee3eeea5b0ba06f47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Declare--Constraints--Simple \
perl-Declare--Constraints--Simple--Library \
perl-Declare--Constraints--Simple--Library--Array \
perl-Declare--Constraints--Simple--Library--Base \
perl-Declare--Constraints--Simple--Library--Exportable \
perl-Declare--Constraints--Simple--Library--General \
perl-Declare--Constraints--Simple--Library--Hash \
perl-Declare--Constraints--Simple--Library--Numerical \
perl-Declare--Constraints--Simple--Library--OO \
perl-Declare--Constraints--Simple--Library--Operators \
perl-Declare--Constraints--Simple--Library--Referencial \
perl-Declare--Constraints--Simple--Library--Scalar \
perl-Declare--Constraints--Simple--Result \
perl-Declare-Constraints-Simple"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Carp--Clan \
perl-Class--Inspector \
perl-aliased"

inherit rpm
