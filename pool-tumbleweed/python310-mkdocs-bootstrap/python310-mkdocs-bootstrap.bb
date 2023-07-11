SUMMARY = "Bootstrap theme for MkDocs"
DESCRIPTION = "Bootstrap theme for MkDocs"
LICENSE = "BSD-2-Clause"

PV = "1.1"

RPM_NAME = "python310-mkdocs-bootstrap-1.1-1.10.noarch.rpm"
RPM_HASH = "bf3e120e9e9d8d71f6bf2f824c2cb609f4e66a1f740c1992fd8d4df868851c9edf353bc4112abbff27b701774f1abee1699fe0212578e96a5dc795c095f0a168"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-mkdocs-bootstrap \
python310-mkdocs-bootstrap \
python3dist-mkdocs-bootstrap"

RDEPENDS:${PN} += "python-abi \
python310-mkdocs"

inherit rpm
