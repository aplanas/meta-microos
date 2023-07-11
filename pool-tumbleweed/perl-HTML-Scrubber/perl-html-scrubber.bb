SUMMARY = "Perl extension for scrubbing/sanitizing HTML"
DESCRIPTION = "If you want to 'scrub' or 'sanitize' html input in a reliable and flexible \
fashion, then this module is for you. \
 \
I wasn't satisfied with HTML::Sanitizer because it is based on \
HTML::TreeBuilder, so I thought I'd write something similar that works \
directly with HTML::Parser."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.19"

RPM_NAME = "perl-HTML-Scrubber-0.19-1.16.noarch.rpm"
RPM_HASH = "f960f4e0ed50e62529975c6f4c407fc8bd06f47815d5a95dc36c40db308ec200b2efe06ee4925a39a75abde377cd4bff4202799376d26be3c372949cdab33856"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTML--Scrubber \
perl-HTML-Scrubber"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-HTML--Entities \
perl-HTML--Parser \
perl-List--Util"

inherit rpm
