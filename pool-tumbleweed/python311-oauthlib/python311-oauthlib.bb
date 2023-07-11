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

RPM_NAME = "python311-oauthlib-3.2.2-2.3.noarch.rpm"
RPM_HASH = "1c7a4ae8c302044f6b7f0ea6edea05af6bec6c66bc528725157112f6bd4c4dfd45906b8b42da27d579c78a953ccf9361f745ed478bbdeda93f4f464c2c7237cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oauthlib \
python3.11dist-oauthlib \
python311-oauthlib \
python3dist-oauthlib"

RDEPENDS:${PN} += "python-abi \
python311-PyJWT \
python311-blinker \
python311-cryptography"

inherit rpm
