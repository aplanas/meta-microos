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

RPM_NAME = "python39-sphinx-theme-builder-0.2.0b1-1.4.noarch.rpm"
RPM_HASH = "db2c158fc41b08b15166220efeac49e450659fd4489e60440c0aa242708a57809fbddb0ac94e126d671480907d8dcc36bdc762d6ee5eb64d0ceb8115f6c3e4b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sphinx-theme-builder \
python39-sphinx-theme-builder \
python3dist-sphinx-theme-builder"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-click \
python39-nodeenv \
python39-packaging \
python39-pyproject-metadata \
python39-rich \
python39-setuptools \
update-alternatives"

inherit rpm
