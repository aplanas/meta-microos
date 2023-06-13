SUMMARY = "Zope Deprecation Infrastructure"
DESCRIPTION = "When we started working on Zope 3.1, we noticed that the hardest part of the \
development process was to ensure backward-compatibility and correctly mark \
deprecated modules, classes, functions, methods and properties. This package \
provides a simple function called 'deprecated(names, reason)' to deprecate the \
previously mentioned Python objects."
LICENSE = "ZPL-2.1"

PV = "5.0"

RPM_NAME = "python39-zope.deprecation-5.0-1.1.noarch.rpm"
RPM_HASH = "8e6b5fc8ed396292f67f483ee747057d7001ca7d3a9718f2d0a53c9aa2b9e938b1d280b8413ce0c30da6d9a06b1478a514f664f014ba8964eac227930cff2ace"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(zope.deprecation) \
python39-zope.deprecation \
python3dist(zope.deprecation)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
