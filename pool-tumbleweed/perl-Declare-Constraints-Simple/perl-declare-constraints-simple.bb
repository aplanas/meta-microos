SUMMARY = "Declarative Validation of Data Structures"
DESCRIPTION = "The main purpose of this module is to provide an easy way to build a \
profile to validate a data structure. It does this by giving you a set of \
declarative keywords in the importing namespace."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.03"

RPM_NAME = "perl-Declare-Constraints-Simple-0.03-16.20.noarch.rpm"
RPM_HASH = "d48b56cb9f8f28ddcd87f3e9e9d02eb78072ee7c4188ce9e1ee8ffe0439a64a5a913f253b3b07f5cc397af1f672a238c1f5a59def854ccedaf9601578407d3b8"
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Carp--Clan \
perl-Class--Inspector \
perl-aliased"

inherit rpm
