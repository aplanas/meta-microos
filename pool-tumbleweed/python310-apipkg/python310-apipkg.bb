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

RPM_NAME = "python310-apipkg-3.0.1-3.1.noarch.rpm"
RPM_HASH = "2a6e141176634ca1e6110226fd7f0a688e4d4929bf23754c9eb14ffc526a28ddd3d8e5ab905c5c596c84b2b4df59d12d86954d562f168b06610d3a1c6915ce0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-apipkg \
python3.10dist(apipkg) \
python310-apipkg \
python3dist(apipkg)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
