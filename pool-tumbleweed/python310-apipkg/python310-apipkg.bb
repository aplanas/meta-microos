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

RPM_NAME = "python310-apipkg-3.0.1-3.3.noarch.rpm"
RPM_HASH = "c966078594910a3cfafbbd9c437a5d319d4c7ce9033907fcbc558c56b8f380864e5cf61409504fb58b2087c693c1accd94f8fc3bd92ad4c34373d8d94a0c54e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-apipkg \
python310-apipkg \
python3dist-apipkg"

RDEPENDS:${PN} += "python-abi"

inherit rpm
