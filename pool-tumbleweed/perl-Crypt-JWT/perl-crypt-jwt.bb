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

RPM_NAME = "perl-Crypt-JWT-0.034-1.9.noarch.rpm"
RPM_HASH = "c1f333dfb77435364419939c071e8c5b36b9cefd8931640c49d1ce3cd586a34df6795232465e691663d1b715d282b164074e335de7516710b328bc9c6222d997"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Crypt--JWT \
perl-Crypt--KeyWrap \
perl-Crypt-JWT"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Compress--Raw--Zlib \
perl-CryptX \
perl-JSON"

inherit rpm
