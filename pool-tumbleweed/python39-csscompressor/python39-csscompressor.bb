SUMMARY = "A python port of YUI CSS Compressor"
DESCRIPTION = "Almost exact python port of YUI CSS Compressor."
LICENSE = "BSD-3-Clause"

PV = "0.9.5"

RPM_NAME = "python39-csscompressor-0.9.5-2.3.noarch.rpm"
RPM_HASH = "0a09ab8e92d8fcf3ef42e7d76eb50e20223d331db5ec78609f6107ded639a3a087a79bb50ec7bf1304d170bbb9dde07fd328a42da4012b20db9417a254d4ab0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-csscompressor \
python39-csscompressor \
python3dist-csscompressor"

RDEPENDS:${PN} += "python-abi"

inherit rpm
