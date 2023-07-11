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

RPM_NAME = "perl-HTML-Clean-1.4-1.16.noarch.rpm"
RPM_HASH = "840f35e56427470d9636a5090de182ea77b5c4875030fa179ae729ce3d2ae3f9e840007c5ec6ca9d3c422dcda84f3650ffda84a3a0fbeb46bcf22d7f20ff3d15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTML--Clean \
perl-HTML-Clean"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
