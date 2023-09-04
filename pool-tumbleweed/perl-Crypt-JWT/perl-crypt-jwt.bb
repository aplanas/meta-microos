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

RPM_NAME = "perl-Crypt-JWT-0.034-1.10.noarch.rpm"
RPM_HASH = "2d2550b169f5cd83147e786c0a623eabb16755fed3090be7be135738ce33935d482fddba2cf898e6905fa7c8245868a94871da464adb455bfac5b0d23b5bfb72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Crypt--JWT \
perl-Crypt--KeyWrap \
perl-Crypt-JWT"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Compress--Raw--Zlib \
perl-CryptX \
perl-JSON"

inherit rpm
