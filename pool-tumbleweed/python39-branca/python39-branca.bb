SUMMARY = "HTML+JS page generator"
DESCRIPTION = "Generate HTML+JS pages with Python."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python39-branca-0.6.0-2.3.noarch.rpm"
RPM_HASH = "81437e453ec78e2551bad166dd09726f5964c792e95bc4db88374d73c6b4b5ccc3c2d26fd4f045ca8a3dddac2e4daa5dd9d4c3e3648c85262eaa05bdf727ba7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-branca \
python39-branca \
python3dist-branca"

RDEPENDS:${PN} += "python-abi \
python39-Jinja2"

inherit rpm
