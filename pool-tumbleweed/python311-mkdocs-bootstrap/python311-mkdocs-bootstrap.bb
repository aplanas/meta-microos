SUMMARY = "Bootstrap theme for MkDocs"
DESCRIPTION = "Bootstrap theme for MkDocs"
LICENSE = "BSD-2-Clause"

PV = "1.1"

RPM_NAME = "python311-mkdocs-bootstrap-1.1-1.10.noarch.rpm"
RPM_HASH = "3147d6877fe59f1a2a398ea6b964a0a76400b2b48eec6dab46199b249e18db0d7ff7d760ccf6c5766f572ad6658883398177a3197e05ac55e80c95ec80e97417"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mkdocs-bootstrap \
python3.11dist-mkdocs-bootstrap \
python311-mkdocs-bootstrap \
python3dist-mkdocs-bootstrap"

RDEPENDS:${PN} += "python-abi \
python311-mkdocs"

inherit rpm
