SUMMARY = "Trusted collections handling: server and signer"
DESCRIPTION = "The Notary project comprises a server and a client for running and \
interacting with trusted collections."
LICENSE = "Apache-2.0"

PV = "0.7.0"

RPM_NAME = "notary-0.7.0-1.13.aarch64.rpm"
RPM_HASH = "9ca42a69d61ee4c9891527bcb4080dde3393aa11132d8b0890c64a3de0fdc0e548f276798c3866c4994658aa47cdc5a04fabb977f1729b5021a54d1ea8ad21a1"

RPROVIDES:${PN} += "config(notary) \
notary \
notary(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/env"

inherit rpm
