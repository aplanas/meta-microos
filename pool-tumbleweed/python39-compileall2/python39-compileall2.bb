SUMMARY = "Enhanced Python `compileall` module"
DESCRIPTION = "Enhanced Python `compileall` module."
LICENSE = "Python-2.0"

PV = "0.7.2"

RPM_NAME = "python39-compileall2-0.7.2-1.4.noarch.rpm"
RPM_HASH = "2d59494baafc06b8ab3e1e48c7af7a6b255f1dc96826c0d3779fbff316587906a7eb3d64b058cf98d672e9f96a1dbe984b12732dd60937c23495e0bb63328be7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-compileall2 \
python39-compileall2 \
python3dist-compileall2"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi"

inherit rpm
