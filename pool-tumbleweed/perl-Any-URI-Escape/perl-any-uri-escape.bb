SUMMARY = "Load URI::Escape::XS preferentially over URI::Escape"
DESCRIPTION = "URI::Escape is great, but URI::Escape::XS is faster. This module loads \
URI::Escape::XS and imports the two most common methods if XS is installed. \
 \
The insides of this module aren't completely shaken out yet, so patches \
welcome."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.01"

RPM_NAME = "perl-Any-URI-Escape-0.01-1.13.noarch.rpm"
RPM_HASH = "6bf5ae3a1eb1f606b8e33fc8f51cc36136cf7ded1cf2f4a89b3a0e56c6bdde1c869b219efe7e20fed09dc0661f20c3f6d03edeb08be940f8139282e95e098002"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Any--URI--Escape \
perl-Any-URI-Escape"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-URI--Escape"

inherit rpm
