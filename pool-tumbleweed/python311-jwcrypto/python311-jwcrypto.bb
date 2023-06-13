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

RPM_NAME = "python311-jwcrypto-1.4.2-1.3.noarch.rpm"
RPM_HASH = "603a4bcb181242d75b1f3a5a956a65cf9bb3e98e5d0e8eed9a25d261cd9b508ea60d6f2e632329bbbc71c8f7337efcc6d4cfa22bb0273ae3854d608a6f149842"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(jwcrypto) \
python311-jwcrypto \
python3dist(jwcrypto)"

RDEPENDS:${PN} += "python(abi) \
python311-Deprecated \
python311-cryptography"

inherit rpm
