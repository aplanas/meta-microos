SUMMARY = "A tool for authoring Sphinx themes with a simple (opinionated) workflow"
DESCRIPTION = "Streamline the Sphinx theme development workflow, by building upon \
existing standardised tools. \
 \
 * simplified packaging experience \
 * simplified JavaScript tooling setup \
 * development server, with rebuild-on-save and automagical browser reloading \
 * consistent repository structure across themes"
LICENSE = "MIT"

PV = "0.2.0b1"

RPM_NAME = "python310-sphinx-theme-builder-0.2.0b1-1.4.noarch.rpm"
RPM_HASH = "834b9e7c82d5d2f5d9151c65798093118cd8201506df0c7fc7b2da42e6f67682980c0435cf642e9eee291efdf5c38a4ef5187d9439a2a9a31be3e9368b899017"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sphinx-theme-builder \
python310-sphinx-theme-builder \
python3dist-sphinx-theme-builder"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-click \
python310-nodeenv \
python310-packaging \
python310-pyproject-metadata \
python310-rich \
python310-setuptools \
update-alternatives"

inherit rpm
