SUMMARY = "Documentation for python-Flask"
DESCRIPTION = "This package contains HTML documentation, including tutorials and API \
reference for python-Flask."
LICENSE = "BSD-3-Clause"

PV = "2.3.2"

RPM_NAME = "python311-Flask-doc-2.3.2-2.1.noarch.rpm"
RPM_HASH = "c8562a816f6f42afc3a026b2b7ef531b3d36d155ae7b92dfd46a43a57ec26e2b86bbe203114c3f66da5df0d99aff24dbfd568617d0221db037ffda9b13b7ce49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-doc \
python311-Flask-doc"

RDEPENDS:${PN} += "python311-Flask"

inherit rpm
