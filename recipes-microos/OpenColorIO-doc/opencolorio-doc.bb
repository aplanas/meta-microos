SUMMARY = "Documentation for OpenColorIO"
DESCRIPTION = "This package contains documentation for OpenColorIO."
LICENSE = "BSD-3-Clause"

PV = "2.1.2"

RPM_NAME = "OpenColorIO-doc-2.1.2-2.5.noarch.rpm"
RPM_HASH = "dd910c30a6b2451e3df680b68af1d4937281e5c451b30f49085dcca278272c01bf81a4def176320a2e295e29e9532661b0b644516bbdf39e749e77f5f48cb48d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "OpenColorIO-doc"
RDEPENDS:${PN} += ""

inherit rpm
