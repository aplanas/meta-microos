SUMMARY = "ECDSA cryptographic signature library (pure python)"
DESCRIPTION = "This is an easy-to-use implementation of ECDSA cryptography (Elliptic Curve \
Digital Signature Algorithm), implemented purely in Python, released under \
the MIT license. With this library, you can quickly create keypairs (signing \
key and verifying key), sign messages, and verify the signatures. The keys \
and signatures are very short, making them easy to handle and incorporate \
into other protocols."
LICENSE = "MIT"

PV = "0.18.0"

RPM_NAME = "python39-ecdsa-0.18.0-2.3.noarch.rpm"
RPM_HASH = "4b964974365084579023a1f0522d595e583aee011bf407cc9649be6b730043fa7c69f7026ea515b6066c3306668dcf98526e98193a97dc559af8c0296d5211f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ecdsa \
python39-ecdsa \
python3dist-ecdsa"

RDEPENDS:${PN} += "python-abi \
python39-six"

inherit rpm
