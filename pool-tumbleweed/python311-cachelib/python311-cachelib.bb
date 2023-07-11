SUMMARY = "A collection of cache libraries in the same API interface"
DESCRIPTION = "A collection of cache libraries in the same API interface."
LICENSE = "BSD-3-Clause"

PV = "0.10.2"

RPM_NAME = "python311-cachelib-0.10.2-3.3.noarch.rpm"
RPM_HASH = "211a59ce51954bc4e25fd4add6a89c614be17ad036300ce88460a9435b4d4fe95396fbf98324670f83625101327ffdf00bc6d30793b6688e13d7d1dcb69506b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cachelib \
python3.11dist-cachelib \
python311-cachelib \
python3dist-cachelib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
