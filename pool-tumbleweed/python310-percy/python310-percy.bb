SUMMARY = "Visual regression testing library"
DESCRIPTION = "Python client library for visual regression testing with Percy."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python310-percy-2.0.2-1.13.noarch.rpm"
RPM_HASH = "08931d8663d326d4de8ce2c77297e098f6dce026450afc8b4bfe8370f20b9db9efd065c7090c1be8e2ea786ce183ca9772ae2f334b5f95af6a5fa4965ade0aca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-percy \
python3.10dist(percy) \
python310-percy \
python3dist(percy)"
RDEPENDS:${PN} += "python(abi) \
python310-requests"

inherit rpm
