SUMMARY = "Perl extension for scrubbing/sanitizing HTML"
DESCRIPTION = "If you want to 'scrub' or 'sanitize' html input in a reliable and flexible \
fashion, then this module is for you. \
 \
I wasn't satisfied with HTML::Sanitizer because it is based on \
HTML::TreeBuilder, so I thought I'd write something similar that works \
directly with HTML::Parser."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.19"

RPM_NAME = "perl-HTML-Scrubber-0.19-1.17.noarch.rpm"
RPM_HASH = "1ad239c50a359f10e9d1a447c657b83aad15cc914fc7309b60ca20f2cadc7189293321b18e605bc14da1e8c27eafc1e1bf695e50542c0224b6145cf10baf6242"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTML--Scrubber \
perl-HTML-Scrubber"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-HTML--Entities \
perl-HTML--Parser \
perl-List--Util"

inherit rpm
