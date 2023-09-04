SUMMARY = "Porters stemming algorithm for Denmark"
DESCRIPTION = "The stem function takes a scalar as a parameter and stems the word \
according to Martin Porters Danish stemming algorithm, which can be found \
at the Snowball website: http://snowball.tartarus.org/."
LICENSE = "GPL-2.0"

PV = "1.01"

RPM_NAME = "perl-Lingua-Stem-Snowball-Da-1.01-1.26.noarch.rpm"
RPM_HASH = "94110e8aa4a87f1be2bb9e0324a75f5c0f22836c017830d3d6d811513d0a5dec75c60fd6ad4b4bd8a9fc5d4287bfa1debc1ccd7612bb7885cf3633ad5b911925"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Lingua--Stem--Snowball--Da \
perl-Lingua-Stem-Snowball-Da"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
