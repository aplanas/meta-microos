SUMMARY = "Documentation for python-mpld3"
DESCRIPTION = "Documentation and examples for python-mpld3"
LICENSE = "BSD-3-Clause"

PV = "0.5.9"

RPM_NAME = "python-mpld3-doc-0.5.9-1.5.noarch.rpm"
RPM_HASH = "c6e0256108053295ca382fe63d5b6aa0b0dc653ab555389bbf4fbc4e144149e2fd609134b3cb31f0c9055537b48629cafda409e254d3b0a84cc1356322bc2e24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-mpld3-doc \
python310-python-mpld3 \
python311-python-mpld3 \
python39-python-mpld3"

RDEPENDS:${PN} += ""

inherit rpm
