SUMMARY = "Bootstrap-based Sphinx theme from the PyData community"
DESCRIPTION = "Bootstrap-based Sphinx theme from the PyData community"
LICENSE = "BSD-3-Clause"

PV = "0.13.1"

RPM_NAME = "python39-pydata-sphinx-theme-0.13.1-2.2.noarch.rpm"
RPM_HASH = "db55630ead34eedbb1de1e3f534a40c602e24c502ba91906bc91930c28af1b42018faf0d9e55b938590d837f1ce4176a0dedc0ee6d40acc30f45a754556fbf31"
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
