SUMMARY = "XStatic base package with minimal support code"
DESCRIPTION = "XStatic is a packaging standard to package external (often 3rd party) \
static files as a Python package."
LICENSE = "MIT"

PV = "1.0.3"

RPM_NAME = "python39-XStatic-1.0.3-1.2.noarch.rpm"
RPM_HASH = "99f283afe5db070295eb1d7764c600ff971f94963f03e795fc603a7a64e9d5b3eee7d400d5115a9eb6d25edd04b82a00c07c3159164760f6897593a041272ef0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-xstatic \
python39-XStatic \
python3dist-xstatic"

RDEPENDS:${PN} += "python-abi"

inherit rpm
