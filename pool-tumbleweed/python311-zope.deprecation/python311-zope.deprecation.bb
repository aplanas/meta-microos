SUMMARY = "Zope Deprecation Infrastructure"
DESCRIPTION = "When we started working on Zope 3.1, we noticed that the hardest part of the \
development process was to ensure backward-compatibility and correctly mark \
deprecated modules, classes, functions, methods and properties. This package \
provides a simple function called 'deprecated(names, reason)' to deprecate the \
previously mentioned Python objects."
LICENSE = "ZPL-2.1"

PV = "5.0"

RPM_NAME = "python311-zope.deprecation-5.0-3.1.noarch.rpm"
RPM_HASH = "dbe7b8c74f388497cd8564b378caaddf0ce69ca7a11fb7c4baf2ed28a6bbeb42d28abbed0c9bfe6bef481db3c10d6c7cc767ac0a3d570e806f3c373f99e20590"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zope.deprecation \
python3.11dist-zope.deprecation \
python311-zope.deprecation \
python3dist-zope.deprecation"

RDEPENDS:${PN} += "python-abi"

inherit rpm
