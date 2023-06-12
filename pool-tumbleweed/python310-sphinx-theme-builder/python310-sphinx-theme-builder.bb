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

RPM_NAME = "python310-sphinx-theme-builder-0.2.0b1-1.2.noarch.rpm"
RPM_HASH = "931dacdfddc9dd0a2934ecbe153b561e24f26b560a33ce2ba3cdb98fb9a505677c4ed3a92bf86c8c3c989bb47c06e5ef062accccfa9ce230be3931e7a1ee7790"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinx-theme-builder \
python3.10dist(sphinx-theme-builder) \
python310-sphinx-theme-builder \
python3dist(sphinx-theme-builder)"
RDEPENDS:${PN} += "(python310-tomli if python310-base < 3.11) \
/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-click \
python310-nodeenv \
python310-packaging \
python310-pyproject-metadata \
python310-rich \
python310-setuptools \
update-alternatives"

inherit rpm
