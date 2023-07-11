SUMMARY = "Trusted collections handling: server and signer"
DESCRIPTION = "The Notary project comprises a server and a client for running and \
interacting with trusted collections."
LICENSE = "Apache-2.0"

PV = "0.7.0"

RPM_NAME = "notary-0.7.0-1.14.aarch64.rpm"
RPM_HASH = "270ae46f146bff094f1c57ff617fa31d7e1e43fd001e33d76f432c6cf02871e7ca24ae57b614a91d552fbf0f8f2418df23a6c1206ad2ec8a380aa0522031af93"

RPROVIDES:${PN} += "config-notary \
notary"

RDEPENDS:${PN} += "/usr/bin/env"

inherit rpm
