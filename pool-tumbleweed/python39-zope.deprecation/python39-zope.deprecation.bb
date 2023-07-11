SUMMARY = "Zope Deprecation Infrastructure"
DESCRIPTION = "When we started working on Zope 3.1, we noticed that the hardest part of the \
development process was to ensure backward-compatibility and correctly mark \
deprecated modules, classes, functions, methods and properties. This package \
provides a simple function called 'deprecated(names, reason)' to deprecate the \
previously mentioned Python objects."
LICENSE = "ZPL-2.1"

PV = "5.0"

RPM_NAME = "python39-zope.deprecation-5.0-2.2.noarch.rpm"
RPM_HASH = "cdf37b00dda969f169ee88475a65ae6badfe3ad46b95b600d75a73ed947826535948e5b57918e3cf3467b23a9767863a6bf539743b538ef2604da4fa2e057df8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-zope.deprecation \
python39-zope.deprecation \
python3dist-zope.deprecation"

RDEPENDS:${PN} += "python-abi"

inherit rpm
