SUMMARY = "Aspect-oriented programming"
DESCRIPTION = "Aspectlib is an aspect-oriented programming, monkey-patch and \
decorators library. It is useful when changing behavior in \
existing code is desired. It includes tools for debugging and \
testing: simple mock/record and a complete capture/replay \
framework."
LICENSE = "BSD-2-Clause"

PV = "2.0.0"

RPM_NAME = "python39-aspectlib-2.0.0-1.3.noarch.rpm"
RPM_HASH = "e2fce20c2e3a649addd36af574221a6f97743f5d8672e048a6d0fc16b28f97d9a62de0df54ba38e1573a873d3f6443464a0036fe6834cb9d7675c80e4b641cb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-aspectlib \
python39-aspectlib \
python3dist-aspectlib"

RDEPENDS:${PN} += "python-abi \
python39-fields"

inherit rpm
