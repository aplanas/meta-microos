SUMMARY = "Perl extension for generating and using LALR parsers"
DESCRIPTION = "Parse::Yapp (Yet Another Perl Parser compiler) is a collection of modules \
that let you generate and use yacc like thread safe (reentrant) parsers \
with perl object oriented interface. \
 \
The script yapp is a front-end to the Parse::Yapp module and let you easily \
create a Perl OO parser from an input grammar file."
LICENSE = "Artistic-1.0 | GPL-2.0+"

PV = "1.21"

RPM_NAME = "perl-Parse-Yapp-1.21-1.22.noarch.rpm"
RPM_HASH = "96d558057ba1a297cb32d3bfb2bd1d56c4073067721add528375bfe7d0e69610b302aca08e0f9cee147f4c8f4a8e1f5de0cc8a84605fc06e3fe548ccff6a5dd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Parse--Yapp \
perl-Parse--Yapp--Driver \
perl-Parse--Yapp--Grammar \
perl-Parse--Yapp--Lalr \
perl-Parse--Yapp--Options \
perl-Parse--Yapp--Output \
perl-Parse--Yapp--Parse \
perl-Parse-Yapp"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
