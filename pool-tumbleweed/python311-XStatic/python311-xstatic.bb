SUMMARY = "XStatic base package with minimal support code"
DESCRIPTION = "XStatic is a packaging standard to package external (often 3rd party) \
static files as a Python package."
LICENSE = "MIT"

PV = "1.0.3"

RPM_NAME = "python311-XStatic-1.0.3-1.2.noarch.rpm"
RPM_HASH = "be3f1a8d4ad159b230abb0472d41bf2a43822798245af47c1e30b11ea3c2906a3ec78a5508678c24f106f878aaaa2e7c226f3c9ac0f3a497fab84058a63773c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-XStatic \
python3.11dist-xstatic \
python311-XStatic \
python3dist-xstatic"

RDEPENDS:${PN} += "python-abi"

inherit rpm
