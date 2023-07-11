SUMMARY = "Interface to Adobe Font Metrics Files"
DESCRIPTION = "This module implements the Font::AFM class. Objects of this class are \
initialized from an AFM file and allow you to obtain information about \
the font and the metrics of the various glyphs in the font."
LICENSE = "Artistic-1.0 | GPL-2.0-or-later"

PV = "1.20"

RPM_NAME = "perl-Font-AFM-1.20-51.16.noarch.rpm"
RPM_HASH = "70b2262914a7267403542b2260e04be79029eced24607a7573ac8a018c5959b03acd861f3362bef17640dae0e8bcefe4f6bc01f461aec7d38d3a827c040559d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Font--AFM \
perl-Font--Metrics--Courier \
perl-Font--Metrics--CourierBold \
perl-Font--Metrics--CourierBoldOblique \
perl-Font--Metrics--CourierOblique \
perl-Font--Metrics--Helvetica \
perl-Font--Metrics--HelveticaBold \
perl-Font--Metrics--HelveticaBoldOblique \
perl-Font--Metrics--HelveticaOblique \
perl-Font--Metrics--TimesBold \
perl-Font--Metrics--TimesBoldItalic \
perl-Font--Metrics--TimesItalic \
perl-Font--Metrics--TimesRoman \
perl-Font-AFM"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
