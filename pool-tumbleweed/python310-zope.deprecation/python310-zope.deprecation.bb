SUMMARY = "Zope Deprecation Infrastructure"
DESCRIPTION = "When we started working on Zope 3.1, we noticed that the hardest part of the \
development process was to ensure backward-compatibility and correctly mark \
deprecated modules, classes, functions, methods and properties. This package \
provides a simple function called 'deprecated(names, reason)' to deprecate the \
previously mentioned Python objects."
LICENSE = "ZPL-2.1"

PV = "5.0"

RPM_NAME = "python310-zope.deprecation-5.0-2.2.noarch.rpm"
RPM_HASH = "0b501915d26da75b9cb075a3ba66e05230b7ab5969f981584728e2cf2023516d4c4e6b45038dd5bd5addaf32fe45366596eb68399262408aefcde8eceab0d1ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-zope.deprecation \
python310-zope.deprecation \
python3dist-zope.deprecation"

RDEPENDS:${PN} += "python-abi"

inherit rpm
