SUMMARY = "Tabbed views for Sphinx"
DESCRIPTION = "Create tabbed content in Sphinx documentation when building HTML."
LICENSE = "MIT"

PV = "3.4.1"

RPM_NAME = "python311-sphinx-tabs-3.4.1-2.3.noarch.rpm"
RPM_HASH = "cb6fc21f2525aff15aabf09f0cbc3b4b6bb528f093dc59966025c2ec404cad32af6d8b36af9b6a2c654530bce1222c3546d387d46846b56fc2d3fe76cc660aaa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinx-tabs \
python3.11dist-sphinx-tabs \
python311-sphinx-tabs \
python3dist-sphinx-tabs"

RDEPENDS:${PN} += "python-abi \
python311-Pygments \
python311-Sphinx \
python311-docutils"

inherit rpm
