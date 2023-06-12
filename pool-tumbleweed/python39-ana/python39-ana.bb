SUMMARY = "The Python 'ana' module"
DESCRIPTION = "A Python module that provides an undocumented data layer for Python objects."
LICENSE = "BSD-2-Clause"

PV = "0.06"

RPM_NAME = "python39-ana-0.06-3.3.noarch.rpm"
RPM_HASH = "25fb3a319aaf371c1ba2cf2ce7127588c8c5f1031f17494ef5e62b0592cb7ccb4b195f2b197d8bfcabf9334532455f88bf6ec5e843c0b7dcae055d8b9c69e946"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(ana) \
python39-ana \
python3dist(ana)"
RDEPENDS:${PN} += "python(abi) \
python39-future"

inherit rpm
