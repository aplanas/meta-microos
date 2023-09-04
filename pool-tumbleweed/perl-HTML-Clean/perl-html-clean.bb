SUMMARY = "Cleans up HTML code for web browsers, not humans"
DESCRIPTION = "The HTML::Clean module encapsulates a number of common techniques for \
minimizing the size of HTML files. You can typically save between 10% and \
50% of the size of a HTML file using these methods. It provides the \
following features: \
 \
* Remove unneeded whitespace (beginning of line, etc) \
 \
* Remove unneeded META elements. \
 \
* Remove HTML comments (except for styles, javascript and SSI) \
 \
* Replace tags with equivalent shorter tags (<strong> --> <b>) \
 \
* etc. \
 \
The entire process is configurable, so you can pick and choose what you want \
to clean."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.4"

RPM_NAME = "perl-HTML-Clean-1.4-1.17.noarch.rpm"
RPM_HASH = "541288ad24c4c4e70a4b90d2e541615e8368038b8b784c71e5a3f78fe6dc16f88ebb072f6bf222cba351777e3a861ef7209d63b3a2abab41ad1989eb9589f6af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTML--Clean \
perl-HTML-Clean"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
