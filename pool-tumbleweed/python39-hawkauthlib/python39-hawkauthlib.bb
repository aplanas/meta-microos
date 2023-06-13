SUMMARY = "Hawk Access Authentication protocol"
DESCRIPTION = "hawkauthlib is a low-level library for implementing Hawk Access Authentication, a \
simple HTTP request-signing scheme described in:https://npmjs.org/package/hawk"
LICENSE = "MPL-2.0"

PV = "2.0.0"

RPM_NAME = "python39-hawkauthlib-2.0.0-5.8.noarch.rpm"
RPM_HASH = "75780afda3b2ddaa69ccfc65b49f76062bc470a23397759cd9395cc6f1e5b1d068e44a0bd76d11bd28ce23a42f631edfd91afc16833529d48f0824ca3d0adbf2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(hawkauthlib) \
python39-hawkauthlib \
python3dist(hawkauthlib)"

RDEPENDS:${PN} += "python(abi) \
python39-WebOb"

inherit rpm
