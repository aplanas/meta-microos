SUMMARY = "Supply Chain Transparency Log"
DESCRIPTION = "Rekor's goals are to provide an immutable tamper resistant ledger of metadata generated within a software projects supply chain. Rekor will enable software maintainers and build systems to record signed metadata to an immutable record. Other parties can then query said metadata to enable them to make informed decisions on trust and non-repudiation of an object's lifecycle. For more details visit the sigstore website \
 \
The Rekor project provides a restful API based server for validation and a transparency log for storage. A CLI application is available to make and verify entries, query the transparency log for inclusion proof, integrity verification of the transparency log or retrieval of entries by either public key or artifact. \
 \
Rekor fulfils the signature transparency role of sigstore's software signing infrastructure. However, Rekor can be run on its own and is designed to be extensible to working with different manifest schemas and PKI tooling."
LICENSE = "Apache-2.0"

PV = "1.3.0"

RPM_NAME = "rekor-1.3.0-1.1.aarch64.rpm"
RPM_HASH = "36e38777d9e5655f5fdea033a53614f0559482499368ceaa496c886251bc252b241619616d5f17c208ed7687bbfcd7f3df32d72acbceb7a8087953d4581fdeec"

RPROVIDES:${PN} += "rekor"

RDEPENDS:${PN} += "/usr/bin/bash \
libc.so.6"

inherit rpm
