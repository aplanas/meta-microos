SUMMARY = "Very basic event publishing system"
DESCRIPTION = "This package contains documentation files for python-zope.event."
LICENSE = "ZPL-2.1"

PV = "4.6"

RPM_NAME = "python-zope.event-doc-4.6-4.2.noarch.rpm"
RPM_HASH = "2f3033123a852d905110f7195aab071e2f4ed1c1ee1956e0f21ddf2e6226696707576492e24f64776e09cebd75fe22fc0536500266b89480afc2b2add2f147d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-zope.event-doc"

RDEPENDS:${PN} += ""

inherit rpm
