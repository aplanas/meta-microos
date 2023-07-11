SUMMARY = "Hawk Access Authentication protocol"
DESCRIPTION = "hawkauthlib is a low-level library for implementing Hawk Access Authentication, a \
simple HTTP request-signing scheme described in:https://npmjs.org/package/hawk"
LICENSE = "MPL-2.0"

PV = "2.0.0"

RPM_NAME = "python39-hawkauthlib-2.0.0-5.10.noarch.rpm"
RPM_HASH = "4de34f55f7d77da2e11ae936e89061d510849d2250567b6f14ebe3e3bfbd548000df4be9d459abcf69a9a91e71f5feeec6b8b8552f77b60102af7e56d937d5dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-hawkauthlib \
python39-hawkauthlib \
python3dist-hawkauthlib"

RDEPENDS:${PN} += "python-abi \
python39-WebOb"

inherit rpm
