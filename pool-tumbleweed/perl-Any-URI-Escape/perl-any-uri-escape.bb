SUMMARY = "Load URI::Escape::XS preferentially over URI::Escape"
DESCRIPTION = "URI::Escape is great, but URI::Escape::XS is faster. This module loads \
URI::Escape::XS and imports the two most common methods if XS is installed. \
 \
The insides of this module aren't completely shaken out yet, so patches \
welcome."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.01"

RPM_NAME = "perl-Any-URI-Escape-0.01-1.14.noarch.rpm"
RPM_HASH = "57434b7b13baf59aff20df4fbe2345f97b365de71f8d10817043647fe1acbbec2b11f27ca442e20e8e428d2a2d8b76d70770d3f5f167ef820044dbdbe7e0d766"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Any--URI--Escape \
perl-Any-URI-Escape"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-URI--Escape"

inherit rpm
