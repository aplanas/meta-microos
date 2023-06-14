SUMMARY = "Perl extension for generating and using LALR parsers"
DESCRIPTION = "Parse::Yapp (Yet Another Perl Parser compiler) is a collection of modules \
that let you generate and use yacc like thread safe (reentrant) parsers \
with perl object oriented interface. \
 \
The script yapp is a front-end to the Parse::Yapp module and let you easily \
create a Perl OO parser from an input grammar file."
LICENSE = "Artistic-1.0 | GPL-2.0+"

PV = "1.21"

RPM_NAME = "perl-Parse-Yapp-1.21-1.21.noarch.rpm"
RPM_HASH = "0a84ab5a1ab2ef4839329deba4afa2802d45d5725b5d9c10f0b965287b2eada48bf89f89895e7a2ffb91870809cf189354398f94805744c6b144160aa646c0fb"
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
perl--MODULE-COMPAT-5.36.0"

inherit rpm
