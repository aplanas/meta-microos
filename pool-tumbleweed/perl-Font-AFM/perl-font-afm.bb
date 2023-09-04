SUMMARY = "Interface to Adobe Font Metrics Files"
DESCRIPTION = "This module implements the Font::AFM class. Objects of this class are \
initialized from an AFM file and allow you to obtain information about \
the font and the metrics of the various glyphs in the font."
LICENSE = "Artistic-1.0 | GPL-2.0-or-later"

PV = "1.20"

RPM_NAME = "perl-Font-AFM-1.20-51.17.noarch.rpm"
RPM_HASH = "5274c688dddb6649e5f8a8dd864dee3377301e722350b810634d6e96cad25969fd252aeeedced548253d56f1f55d5ff5be7f9bf715cd0488e459b5a15e756dd0"
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
