SUMMARY = "Test the Kwalitee of a distribution before you release it"
DESCRIPTION = "Kwalitee is an automatically-measurable gauge of how good your software is. \
That's very different from quality, which a computer really can't measure \
in a general sense. (If you can, you've solved a hard problem in computer \
science.) \
 \
In the world of the CPAN, the CPANTS project (CPAN Testing Service; also a \
funny acronym on its own) measures Kwalitee with several metrics. If you \
plan to release a distribution to the CPAN -- or even within your own \
organization -- testing its Kwalitee before creating a release can help you \
improve your quality as well. \
 \
'Test::Kwalitee' and a short test file will do this for you automatically."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.28"

RPM_NAME = "perl-Test-Kwalitee-1.28-1.10.noarch.rpm"
RPM_HASH = "0cb8a28b49ad0ec77e4961bf4e748128636c566492407a0cbaa778bbe5743662f92e0758d87d9e8cc570c05d9f1804480d123233392ad7d526f4b6be18c4670a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Kwalitee \
perl-Test-Kwalitee"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1 \
perl-Module--CPANTS--Analyse \
perl-Test--Builder \
perl-parent"

inherit rpm
