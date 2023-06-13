SUMMARY = "XStatic base package with minimal support code"
DESCRIPTION = "XStatic is a packaging standard to package external (often 3rd party) \
static files as a Python package."
LICENSE = "MIT"

PV = "1.0.3"

RPM_NAME = "python310-XStatic-1.0.3-1.1.noarch.rpm"
RPM_HASH = "3c83bfe2998c9e6139f097216e50de6d825acc1a8889d1b66540b2851bb89fe08e8170ebe4d627f0ead048b538148dc57c967b7f2f8e340016a89e0ef8771c67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-XStatic \
python3.10dist(xstatic) \
python310-XStatic \
python3dist(xstatic)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
