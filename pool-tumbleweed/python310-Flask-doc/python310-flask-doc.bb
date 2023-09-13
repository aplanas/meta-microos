SUMMARY = "Documentation for python-Flask"
DESCRIPTION = "This package contains HTML documentation, including tutorials and API \
reference for python-Flask."
LICENSE = "BSD-3-Clause"

PV = "2.3.2"

RPM_NAME = "python310-Flask-doc-2.3.2-2.1.noarch.rpm"
RPM_HASH = "b99bfd0a909f08d1806cdbb067d4ead3fa32609c8b904f04d98c4b2429db6b0707af4b4903477c9be6fb5cc443f3601c92e032c12565f315e377d3243450169a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-Flask-doc"

RDEPENDS:${PN} += "python310-Flask"

inherit rpm
