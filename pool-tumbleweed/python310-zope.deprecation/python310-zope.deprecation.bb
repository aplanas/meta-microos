SUMMARY = "Zope Deprecation Infrastructure"
DESCRIPTION = "When we started working on Zope 3.1, we noticed that the hardest part of the \
development process was to ensure backward-compatibility and correctly mark \
deprecated modules, classes, functions, methods and properties. This package \
provides a simple function called 'deprecated(names, reason)' to deprecate the \
previously mentioned Python objects."
LICENSE = "ZPL-2.1"

PV = "5.0"

RPM_NAME = "python310-zope.deprecation-5.0-1.1.noarch.rpm"
RPM_HASH = "4b63b5d3cb64b079119701fa784de923da83138e10923587eef26dea1e587719f2d76c57794f2eb6cc3fc4c90dac8acc9819c88ca3d28b5ae074241ba2abdf4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zope.deprecation \
python3.10dist(zope.deprecation) \
python310-zope.deprecation \
python3dist(zope.deprecation)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
