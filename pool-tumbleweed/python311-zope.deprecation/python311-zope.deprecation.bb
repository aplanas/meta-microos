SUMMARY = "Zope Deprecation Infrastructure"
DESCRIPTION = "When we started working on Zope 3.1, we noticed that the hardest part of the \
development process was to ensure backward-compatibility and correctly mark \
deprecated modules, classes, functions, methods and properties. This package \
provides a simple function called 'deprecated(names, reason)' to deprecate the \
previously mentioned Python objects."
LICENSE = "ZPL-2.1"

PV = "5.0"

RPM_NAME = "python311-zope.deprecation-5.0-2.2.noarch.rpm"
RPM_HASH = "ac176513fecd96cfbabf0669d18756d47eefe56771b54504e7e4fa893e1de7398787542bf414de28eaa1b86ca0cc73cc7857dd82f21d9cccb7544f9f4ff3610e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zope.deprecation \
python3.11dist-zope.deprecation \
python311-zope.deprecation \
python3dist-zope.deprecation"

RDEPENDS:${PN} += "python-abi"

inherit rpm
