SUMMARY = "Sphinx Bootstrap Theme"
DESCRIPTION = "This Sphinx theme integrates the Bootstrap CSS / JavaScript framework \
with various layout options, hierarchical menu navigation, and \
mobile-friendly responsive design. It is configurable, extensible, and \
can use any number of different Bootswatch CSS themes."
LICENSE = "Apache-2.0 & MIT"

PV = "0.8.1"

RPM_NAME = "python39-sphinx-bootstrap-theme-0.8.1-2.3.noarch.rpm"
RPM_HASH = "73379ba234ff37d8de8eb55fd5e7984a73ec0245b795ac3c7cd550488813af256db32fc778082d03e1ee4856456c0ea1f6d313430ed5eb5c78acfe659bfd0196"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sphinx-bootstrap-theme \
python39-sphinx-bootstrap-theme \
python3dist-sphinx-bootstrap-theme"

RDEPENDS:${PN} += "python-abi \
python39-Sphinx"

inherit rpm
