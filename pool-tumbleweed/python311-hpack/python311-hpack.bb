SUMMARY = "Pure-Python HPACK header compression"
DESCRIPTION = "This module contains a pure-Python HTTP/2 header encoding (HPACK) logic for use in \
Python programs that implement HTTP/2. It also contains a compatibility layer that \
automatically enables the use of nghttp2 if it’s available."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python311-hpack-4.0.0-2.3.noarch.rpm"
RPM_HASH = "2e7083d96ecb9d9a1e21c1a0588fd5acd05be4bb9f50fc3feb369e7e0c2798b56c51f67f102eca2ef3d429c85f07c275f6cd70e9fdce03ad401db859698d5693"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hpack \
python3.11dist-hpack \
python311-hpack \
python3dist-hpack"

RDEPENDS:${PN} += "python-abi"

inherit rpm
