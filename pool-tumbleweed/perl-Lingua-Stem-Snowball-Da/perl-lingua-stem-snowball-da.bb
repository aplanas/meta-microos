SUMMARY = "Porters stemming algorithm for Denmark"
DESCRIPTION = "The stem function takes a scalar as a parameter and stems the word \
according to Martin Porters Danish stemming algorithm, which can be found \
at the Snowball website: http://snowball.tartarus.org/."
LICENSE = "GPL-2.0"

PV = "1.01"

RPM_NAME = "perl-Lingua-Stem-Snowball-Da-1.01-1.25.noarch.rpm"
RPM_HASH = "47112f133009c8a0337b8c042252b3c0bf2f3dead9d085f4c3f066fc68d00e5166fbfc7288a3c1427ab5c70822b9bf7bb4425b555242e96f892a5988fc513b37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Lingua--Stem--Snowball--Da \
perl-Lingua-Stem-Snowball-Da"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
