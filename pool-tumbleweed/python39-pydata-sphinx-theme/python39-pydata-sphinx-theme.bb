SUMMARY = "Bootstrap-based Sphinx theme from the PyData community"
DESCRIPTION = "Bootstrap-based Sphinx theme from the PyData community"
LICENSE = "BSD-3-Clause"

PV = "0.13.1"

RPM_NAME = "python39-pydata-sphinx-theme-0.13.1-2.1.noarch.rpm"
RPM_HASH = "f9b037f4862fb0c1428f1e188d02a249b29ef3dfa074a48390a4c887fd81fe03b3ee7c7e55b0f1094fcb56d779a696bda4a6ba539aefd9be0a3af4a120b0d5af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pydata-sphinx-theme \
python39-pydata-sphinx-theme \
python3dist-pydata-sphinx-theme"

RDEPENDS:${PN} += "python-abi \
python39-Sphinx \
python39-beautifulsoup4 \
python39-docutils \
python39-sphinx-theme-builder"

inherit rpm
