SUMMARY = "Porters stemming algorithm for Denmark"
DESCRIPTION = "The stem function takes a scalar as a parameter and stems the word \
according to Martin Porters Danish stemming algorithm, which can be found \
at the Snowball website: http://snowball.tartarus.org/."
LICENSE = "GPL-2.0"

PV = "1.01"

RPM_NAME = "perl-Lingua-Stem-Snowball-Da-1.01-1.24.noarch.rpm"
RPM_HASH = "45a46dae2eb53c444c8599b4f3186bee1b54d0e1e8fc0f1ddea2ca914b71b051a1767d5373aa6f43ff8b86362c55bd72b68a2d89e6cc32334efd4a3f2b2acdf2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Lingua::Stem::Snowball::Da) \
perl-Lingua-Stem-Snowball-Da"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
