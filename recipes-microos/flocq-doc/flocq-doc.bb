SUMMARY = "Documentation for Flocq"
DESCRIPTION = "This package contains the HTML documentation for flocq."
LICENSE = "LGPL-3.0-or-later"

PV = "4.1.1"

RPM_NAME = "flocq-doc-4.1.1-1.3.noarch.rpm"
RPM_HASH = "cee642c8bab95471905a811d499c2d709782aa3a1de9921a09721157cd92e713767bedc6997a70a650732869d1f2739ae671658bcb47f572201d2fd3c2126e15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flocq-doc"
RDEPENDS:${PN} += "coq-doc \
flocq"

inherit rpm
