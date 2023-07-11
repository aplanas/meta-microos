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

RPM_NAME = "python311-apipkg-3.0.1-3.3.noarch.rpm"
RPM_HASH = "9c7b2307af563039d63aac8187b007a2560cb0cfd48ef99d14743764a4986347a50c57404379c932bdc6e9729b0286eca37685c9fd24c99aed05b0bd43a2f010"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-apipkg \
python3.11dist-apipkg \
python311-apipkg \
python3dist-apipkg"

RDEPENDS:${PN} += "python-abi"

inherit rpm
