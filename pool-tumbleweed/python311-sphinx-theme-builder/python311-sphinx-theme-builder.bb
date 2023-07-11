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

RPM_NAME = "python311-sphinx-theme-builder-0.2.0b1-1.4.noarch.rpm"
RPM_HASH = "7b2bcf8694bfe85f106bfe42e7e17f92bee5eb25c4aeb9e2c3b040e69d719ae7465f8628cdf77012029da14fb6e77565376548b47247ff7e26844c8d81d05f0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinx-theme-builder \
python3.11dist-sphinx-theme-builder \
python311-sphinx-theme-builder \
python3dist-sphinx-theme-builder"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-click \
python311-nodeenv \
python311-packaging \
python311-pyproject-metadata \
python311-rich \
python311-setuptools \
update-alternatives"

inherit rpm
