SUMMARY = "XStatic base package with minimal support code"
DESCRIPTION = "XStatic is a packaging standard to package external (often 3rd party) \
static files as a Python package."
LICENSE = "MIT"

PV = "1.0.3"

RPM_NAME = "python39-XStatic-1.0.3-1.1.noarch.rpm"
RPM_HASH = "33264f7f6220470e6613ed766c64812fdce2f34009d735580afa45dc2636e1d4c977a2d9bacff9d1038e7d30961c18dd344d771f54ec95b30eb36964c574e9cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(xstatic) \
python39-XStatic \
python3dist(xstatic)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
