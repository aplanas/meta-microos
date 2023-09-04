SUMMARY = "No-fuss generation of Atom syndication feeds"
DESCRIPTION = "This is a minimal API for generating Atom syndication feeds quickly and \
easily. It supports all aspects of the Atom format itself but has no \
mechanism for the inclusion of extension elements. \
 \
You can supply strings for most things, and the module will provide useful \
defaults. When you want more control, you can provide data structures, as \
documented, to specify more particulars."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.905"

RPM_NAME = "perl-XML-Atom-SimpleFeed-0.905-1.4.noarch.rpm"
RPM_HASH = "82ecb22b63718f360d28b7fca9b5afdba6db9068aaa49669e30217dd2e917064c070f3247cdc3f836cee946fded554a5c4238053dbc00a02d993eb36cc968ade"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--Atom--SimpleFeed \
perl-XML-Atom-SimpleFeed"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
