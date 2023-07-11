SUMMARY = "Enhanced Python builtin doctest module"
DESCRIPTION = "A rewrite of the builtin doctest module with a pytest plugin."
LICENSE = "Apache-2.0"

PV = "1.1.1"

RPM_NAME = "python310-xdoctest-1.1.1-1.3.noarch.rpm"
RPM_HASH = "5bdb6ba645986c4fed497e57136186a59cbf80f1f988d1f104d97722cd469d69cd3735d1ab88529158e2d8e9b97336f6a13ffa49a8b5c4a82fab395fff6b1417"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-xdoctest \
python310-xdoctest \
python3dist-xdoctest"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
