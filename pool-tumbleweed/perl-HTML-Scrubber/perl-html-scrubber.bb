SUMMARY = "Perl extension for scrubbing/sanitizing HTML"
DESCRIPTION = "If you want to 'scrub' or 'sanitize' html input in a reliable and flexible \
fashion, then this module is for you. \
 \
I wasn't satisfied with HTML::Sanitizer because it is based on \
HTML::TreeBuilder, so I thought I'd write something similar that works \
directly with HTML::Parser."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.19"

RPM_NAME = "perl-HTML-Scrubber-0.19-1.15.noarch.rpm"
RPM_HASH = "0d0fad7a591ea0aaba137e180798516ee57d61f0856f97fa7198121c67363947d4f7771480fe2cdeaa01eeba2ca67dccd62866ffef4ff9570bb477950ebf288e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(HTML::Scrubber) \
perl-HTML-Scrubber"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(HTML::Entities) \
perl(HTML::Parser) \
perl(List::Util)"

inherit rpm
