SUMMARY = "Hawk Access Authentication protocol"
DESCRIPTION = "hawkauthlib is a low-level library for implementing Hawk Access Authentication, a \
simple HTTP request-signing scheme described in:https://npmjs.org/package/hawk"
LICENSE = "MPL-2.0"

PV = "2.0.0"

RPM_NAME = "python310-hawkauthlib-2.0.0-5.10.noarch.rpm"
RPM_HASH = "fb2dca3480d864c84047e53f6712a343f59a3ec3ca910ae2e2b30dbc84ab1a2df0db53e339149fcb55f9aa96f0a26d76e54ee48b6b09038a455b1ca57a32a177"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-hawkauthlib \
python310-hawkauthlib \
python3dist-hawkauthlib"

RDEPENDS:${PN} += "python-abi \
python310-WebOb"

inherit rpm
