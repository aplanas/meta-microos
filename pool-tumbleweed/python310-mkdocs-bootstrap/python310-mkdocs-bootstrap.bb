SUMMARY = "Bootstrap theme for MkDocs"
DESCRIPTION = "Bootstrap theme for MkDocs"
LICENSE = "BSD-2-Clause"

PV = "1.1"

RPM_NAME = "python310-mkdocs-bootstrap-1.1-1.8.noarch.rpm"
RPM_HASH = "c3ea4274dab919955f47d859a406d1dbe711947f1551fa046ca455e54b76d6a5f1e77b0cedd34486590b7b602e52050d4069971671a523fe2f602b64d5f03eda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mkdocs-bootstrap \
python3.10dist-mkdocs-bootstrap \
python310-mkdocs-bootstrap \
python3dist-mkdocs-bootstrap"

RDEPENDS:${PN} += "python-abi \
python310-mkdocs"

inherit rpm
