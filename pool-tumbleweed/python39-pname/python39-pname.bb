SUMMARY = "Check whether a package name is available on PyPI"
DESCRIPTION = "Check whether a package name is available on PyPI"
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "python39-pname-1.0.2-1.14.noarch.rpm"
RPM_HASH = "87abab4139a8ed1d4988c2ed5e063bada3def690915d5132da10b3af347c207a164af5b59017b8903e372d89c79725ef04d386e05589114d5b1285f97efa709f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pname \
python39-pname \
python3dist-pname"

RDEPENDS:${PN} += "python-abi"

inherit rpm
