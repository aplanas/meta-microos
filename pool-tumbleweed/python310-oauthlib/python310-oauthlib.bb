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

RPM_NAME = "python310-oauthlib-3.2.2-2.3.noarch.rpm"
RPM_HASH = "48291e27b0c9969cb8c72ae3dbeb0914570c216f42b7ffa609ec124f31fa9486c0cac7e21b7d70d4cb5fe97048c86a81038b5b81b0fa18ff0023f5beb1f9e104"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-oauthlib \
python310-oauthlib \
python3dist-oauthlib"

RDEPENDS:${PN} += "python-abi \
python310-PyJWT \
python310-blinker \
python310-cryptography"

inherit rpm
