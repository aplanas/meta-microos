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

RPM_NAME = "python39-oauthlib-3.2.2-2.1.noarch.rpm"
RPM_HASH = "1b00df0afdd8e46b4e4adea85593b82dced1271d5716cf49657ad3590707fdc015d7d3ddccd6c067173ae5bca0f20aa7c4066796c05004e83bf0f82d88f910be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(oauthlib) \
python39-oauthlib \
python3dist(oauthlib)"

RDEPENDS:${PN} += "python(abi) \
python39-PyJWT \
python39-blinker \
python39-cryptography"

inherit rpm
