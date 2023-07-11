SUMMARY = "XStatic base package with minimal support code"
DESCRIPTION = "XStatic is a packaging standard to package external (often 3rd party) \
static files as a Python package."
LICENSE = "MIT"

PV = "1.0.3"

RPM_NAME = "python310-XStatic-1.0.3-1.2.noarch.rpm"
RPM_HASH = "cbab5acfb5418a1ed6f5d97d83c19ea5ff0e0b6cab970389c97186e0b8c6560adbcc56fcddeeb2176385dc41c0663d963500d96d41563bd88b7c1363d001a8c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-xstatic \
python310-XStatic \
python3dist-xstatic"

RDEPENDS:${PN} += "python-abi"

inherit rpm
