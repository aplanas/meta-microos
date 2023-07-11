SUMMARY = "A Generic Implementation of the OAuth Request-Signing Logic"
DESCRIPTION = "A generic, spec-compliant, thorough implementation of the OAuth request-signing \
logic. \
 \
OAuth often seems complicated and difficult-to-implement. There are several \
prominent libraries for signing OAuth requests, but they all suffer from one or \
both of the following: \
 \
1. They predate the OAuth 1.0 spec, AKA RFC 5849. \
2. They predate the OAuth 2.0 spec, AKA RFC 6749. \
3. They assume the usage of a specific HTTP request library. \
 \
OAuthLib is a generic utility which implements the logic of OAuth without \
assuming a specific HTTP request object. Use it to graft OAuth support onto your \
favorite HTTP library. If you're a maintainer of such a library, write a thin \
veneer on top of OAuthLib and get OAuth support for very little effort."
LICENSE = "BSD-3-Clause"

PV = "3.2.2"

RPM_NAME = "python39-oauthlib-3.2.2-2.3.noarch.rpm"
RPM_HASH = "3ca8bc3dea928f37c703e4c32b0b7ebf9dca257f13883c0b0c9c099d1f283b3f094fae9eab0eccfe0dcb680a487488bc290ddf927b33c28b9cac70412fd9147f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-oauthlib \
python39-oauthlib \
python3dist-oauthlib"

RDEPENDS:${PN} += "python-abi \
python39-PyJWT \
python39-blinker \
python39-cryptography"

inherit rpm
