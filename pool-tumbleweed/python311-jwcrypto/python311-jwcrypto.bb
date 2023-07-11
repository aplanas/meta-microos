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

RPM_NAME = "python311-jwcrypto-1.4.2-1.5.noarch.rpm"
RPM_HASH = "4afc9949a4c0e3abbedfed24e58026261308c8b932304b286e0e4e153b36a3ffa22d47312928eef3c0b4d5eb68dd00dba480efbf36655151ac85ec37cd007f3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jwcrypto \
python3.11dist-jwcrypto \
python311-jwcrypto \
python3dist-jwcrypto"

RDEPENDS:${PN} += "python-abi \
python311-Deprecated \
python311-cryptography"

inherit rpm
