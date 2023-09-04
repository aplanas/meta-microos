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

RPM_NAME = "perl-Test-Kwalitee-1.28-1.11.noarch.rpm"
RPM_HASH = "c75045c1e308246e2a64610f6e3adc3d852705599bb97d4e457463dc75f9778b1649dce1e8e0996b5fda6d8cd6d2e9d62831aa967d07b3e9bb8dcdad4c489985"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Kwalitee \
perl-Test-Kwalitee"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.38.0 \
perl-Module--CPANTS--Analyse \
perl-Test--Builder \
perl-parent"

inherit rpm
