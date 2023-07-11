SUMMARY = "Namespace control and lazy-import mechanism"
DESCRIPTION = "With apipkg you can control the exported namespace of a \
python package and greatly reduce the number of imports for your users. \
It is a small pure python module that works on CPython 2.7 and 3.4+, \
Jython and PyPy.  It co-operates well with Python's help() system, \
custom importers (PEP302) and common command line completion tools. \
 \
Usage is very simple: you can require 'apipkg' as a dependency or you \
can copy paste the ~200 lines of code into your project."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python39-apipkg-3.0.1-3.3.noarch.rpm"
RPM_HASH = "0cebafa952e1bf178fdeabf868db259b0e7472935365c564d30958d85253c50574c4dd07255a50a327f83f8c693b06a60cfd9abb6abae539365b6a5503c85d97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-apipkg \
python39-apipkg \
python3dist-apipkg"

RDEPENDS:${PN} += "python-abi"

inherit rpm
