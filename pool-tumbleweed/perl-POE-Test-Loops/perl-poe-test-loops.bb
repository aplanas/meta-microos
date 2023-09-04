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

RPM_NAME = "perl-POE-Test-Loops-1.360-1.28.noarch.rpm"
RPM_HASH = "a5ef03630c7ea53b83d8e870a46069123a51e6311def10038837acf5a2be95855cb82bdba2309415f76e4125865cd4a5c50b1974cac0d632905ecbd60f427caa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-POE--Test--DondeEstan \
perl-POE--Test--Loops \
perl-POE-Test-Loops"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.38.0 \
perl-Test--More"

inherit rpm
