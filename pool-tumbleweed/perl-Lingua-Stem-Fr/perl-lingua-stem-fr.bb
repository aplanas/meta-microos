SUMMARY = "Perl French Stemming"
DESCRIPTION = "This module use the a modified version of the Porter Stemming Algorithm to \
return a stemmed words."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.02"

RPM_NAME = "perl-Lingua-Stem-Fr-0.02-9.26.noarch.rpm"
RPM_HASH = "1563e51432c247aea46712bb10ac97e0621f6b40fa1990ae9421da10768d793e64b19350a2e8f7a507a9ce18ff4126fd396ff6dacaa2b46a0bc25758d1d64210"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Lingua--Stem--Fr \
perl-Lingua-Stem-Fr"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
