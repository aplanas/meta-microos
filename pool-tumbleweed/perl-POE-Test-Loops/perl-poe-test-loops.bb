SUMMARY = "Reusable tests for POE::Loop authors"
DESCRIPTION = "POE::Test::Loops contains one function, generate(), which will generate all \
the loop tests for one or more POE::Loop subclasses. \
 \
The the /SYNOPSIS manpage example is a version of the poe-gen-tests \
manpage, which is a stand-alone utility to generate the actual tests. the \
poe-gen-tests manpage also documents the POE::Test::Loops system in more \
detail."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.360"

RPM_NAME = "perl-POE-Test-Loops-1.360-1.27.noarch.rpm"
RPM_HASH = "33ecf323b05fc502848bb6e2b10c723c5fa42d0246390704c5d334ca03a435880302ddec9918a9a4fe9cea9384599b33eb33a0883713c2cc9173556dfdca18b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-POE--Test--DondeEstan \
perl-POE--Test--Loops \
perl-POE-Test-Loops"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1 \
perl-Test--More"

inherit rpm
