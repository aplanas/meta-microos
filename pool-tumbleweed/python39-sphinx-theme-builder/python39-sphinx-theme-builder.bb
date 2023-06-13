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

RPM_NAME = "python39-sphinx-theme-builder-0.2.0b1-1.2.noarch.rpm"
RPM_HASH = "8ba449a74ece93d8b196f80baf44603a476740385aab834fd3a66f46efa8bbe4f37d4ed142bc543df68f765d4b19295b359a38a5fd6a1b7bd498de77627e1b88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sphinx-theme-builder) \
python39-sphinx-theme-builder \
python3dist(sphinx-theme-builder)"

RDEPENDS:${PN} += "(python39-tomli if python39-base < 3.11) \
/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-click \
python39-nodeenv \
python39-packaging \
python39-pyproject-metadata \
python39-rich \
python39-setuptools \
update-alternatives"

inherit rpm
