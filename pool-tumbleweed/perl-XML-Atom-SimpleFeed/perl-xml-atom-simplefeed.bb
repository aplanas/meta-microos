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

RPM_NAME = "perl-XML-Atom-SimpleFeed-0.905-1.3.noarch.rpm"
RPM_HASH = "e92f5a3069e36f889ceb07f8cc142ddde16cda1db5980203f371128f273adb8c82191f8ccfc28e454f115ed24f762a8977fa866d10910e3bea2474f67e4b0c35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-XML--Atom--SimpleFeed \
perl-XML-Atom-SimpleFeed"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
