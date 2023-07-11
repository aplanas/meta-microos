SUMMARY = "Python module package implementing JOSE Web standards"
DESCRIPTION = "A Python implementation of the JOSE Working Group documents: \
RFC 7515 - JSON Web Signature (JWS) \
RFC 7516 - JSON Web Encryption (JWE) \
RFC 7517 - JSON Web Key (JWK) \
RFC 7518 - JSON Web Algorithms (JWA) \
RFC 7519 - JSON Web Token (JWT) \
RFC 7520 - Examples of Protecting Content Using JSON Object Signing and Encryption (JOSE)"
LICENSE = "LGPL-3.0-only"

PV = "1.4.2"

RPM_NAME = "python39-jwcrypto-1.4.2-1.5.noarch.rpm"
RPM_HASH = "76b78a509dbb4129dc9e52a6711703e602ed4ea5d1df6e0166449dfc43bbdd2401d675697bb0ca25b008f5399f92df1abc04c0f37dc057986b915a73f602e1bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jwcrypto \
python39-jwcrypto \
python3dist-jwcrypto"

RDEPENDS:${PN} += "python-abi \
python39-Deprecated \
python39-cryptography"

inherit rpm
