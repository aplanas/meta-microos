SUMMARY = "Zope Deprecation Infrastructure"
DESCRIPTION = "When we started working on Zope 3.1, we noticed that the hardest part of the \
development process was to ensure backward-compatibility and correctly mark \
deprecated modules, classes, functions, methods and properties. This package \
provides a simple function called 'deprecated(names, reason)' to deprecate the \
previously mentioned Python objects."
LICENSE = "ZPL-2.1"

PV = "5.0"

RPM_NAME = "python39-zope.deprecation-5.0-3.1.noarch.rpm"
RPM_HASH = "738c2f578fd852181667720076fa9b2b2cdc0c24b896b67088362983ff787d15b406f3e86e26bfdd8dfea8640e4458ecca08d629624791804d3e013afdc5c804"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-zope.deprecation \
python39-zope.deprecation \
python3dist-zope.deprecation"

RDEPENDS:${PN} += "python-abi"

inherit rpm
