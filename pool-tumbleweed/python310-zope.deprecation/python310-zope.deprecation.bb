SUMMARY = "Zope Deprecation Infrastructure"
DESCRIPTION = "When we started working on Zope 3.1, we noticed that the hardest part of the \
development process was to ensure backward-compatibility and correctly mark \
deprecated modules, classes, functions, methods and properties. This package \
provides a simple function called 'deprecated(names, reason)' to deprecate the \
previously mentioned Python objects."
LICENSE = "ZPL-2.1"

PV = "5.0"

RPM_NAME = "python310-zope.deprecation-5.0-3.1.noarch.rpm"
RPM_HASH = "15068218bcf5c0533dd4b8f9dbdd6e76c7f0a37c6c543370559fbc33dfdf40f7e736d6949ae1ea28bb828f0049e8f8c62210c0f272fd3d5ed9283d29d2698224"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-zope.deprecation \
python310-zope.deprecation \
python3dist-zope.deprecation"

RDEPENDS:${PN} += "python-abi"

inherit rpm
