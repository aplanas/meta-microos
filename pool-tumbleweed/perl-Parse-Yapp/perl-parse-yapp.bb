SUMMARY = "Perl extension for generating and using LALR parsers"
DESCRIPTION = "Parse::Yapp (Yet Another Perl Parser compiler) is a collection of modules \
that let you generate and use yacc like thread safe (reentrant) parsers \
with perl object oriented interface. \
 \
The script yapp is a front-end to the Parse::Yapp module and let you easily \
create a Perl OO parser from an input grammar file."
LICENSE = "Artistic-1.0 | GPL-2.0+"

PV = "1.21"

RPM_NAME = "perl-Parse-Yapp-1.21-1.23.noarch.rpm"
RPM_HASH = "4a60473fd1989c5e62a5743b503cca7d838fb99172dc0d676f6866db2ccc46daf7a04dbe08bcb88f384d2cc66b649194026e118dbdc0fe39d105b398f66c416b"
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
perl--MODULE-COMPAT-5.38.0"

inherit rpm
