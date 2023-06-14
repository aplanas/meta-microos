SUMMARY = "JSON Web Token (JWT, JWS, JWE) as defined by RFC7519, RFC7515, RFC7516"
DESCRIPTION = "Implements *JSON Web Token (JWT)* - https://tools.ietf.org/html/rfc7519. \
The implementation covers not only *JSON Web Signature (JWS)* - \
https://tools.ietf.org/html/rfc7515, but also *JSON Web Encryption (JWE)* - \
https://tools.ietf.org/html/rfc7516. \
 \
The module implements *all (100%) algorithms* defined in \
https://tools.ietf.org/html/rfc7518 - *JSON Web Algorithms (JWA)*. \
 \
This module supports *Compact JWS/JWE* and *Flattened JWS/JWE JSON* \
serialization, general JSON serialization is not supported yet."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.034"

RPM_NAME = "perl-Crypt-JWT-0.034-1.8.noarch.rpm"
RPM_HASH = "dbd3721ca2d8c3d5ff86ef27ba33dec633054839134093aaf03b8f86a1a6784202f5bb4eb04868a82959d9e642565ee748744b350259a7e8169011336d0fbea3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Crypt--JWT \
perl-Crypt--KeyWrap \
perl-Crypt-JWT"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Compress--Raw--Zlib \
perl-CryptX \
perl-JSON"

inherit rpm
