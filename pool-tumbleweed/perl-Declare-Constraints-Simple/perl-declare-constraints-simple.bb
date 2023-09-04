SUMMARY = "Declarative Validation of Data Structures"
DESCRIPTION = "The main purpose of this module is to provide an easy way to build a \
profile to validate a data structure. It does this by giving you a set of \
declarative keywords in the importing namespace."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.03"

RPM_NAME = "perl-Declare-Constraints-Simple-0.03-16.22.noarch.rpm"
RPM_HASH = "cb0c0262abe4189587e2f0c190e5c462919e1d9ccd4e35abf3aaaf60713dd86c49b3ccd97486923ac27d2734d70103698a15b4ab79ed03fd883f199ab5f134b4"
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Carp--Clan \
perl-Class--Inspector \
perl-aliased"

inherit rpm
