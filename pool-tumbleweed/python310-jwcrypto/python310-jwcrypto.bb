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

RPM_NAME = "python310-jwcrypto-1.4.2-1.5.noarch.rpm"
RPM_HASH = "c23da0e1129d60f38da1a366ae0cffc2a42c9754b224884e77fd9a31924af52743fcc3c31c48c799f7f6e97bec5574069ea3bc27053b3497a2a6a17b8fffbd16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jwcrypto \
python310-jwcrypto \
python3dist-jwcrypto"

RDEPENDS:${PN} += "python-abi \
python310-Deprecated \
python310-cryptography"

inherit rpm
