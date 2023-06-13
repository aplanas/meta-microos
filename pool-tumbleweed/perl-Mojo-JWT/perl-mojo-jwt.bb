SUMMARY = "JSON Web Token the Mojo way"
DESCRIPTION = "JSON Web Token is described in https://tools.ietf.org/html/rfc7519. \
Mojo::JWT implements that standard with an API that should feel familiar to \
Mojolicious users (though of course it is useful elsewhere). Indeed, JWT is \
much like Mojolicious::Sessions except that the result is a url-safe text \
string rather than a cookie. \
 \
In JWT, the primary payload is called the 'claims', and a few claims are \
reserved, as seen in the IETF document. The header and the claims are \
signed when stringified to guard against tampering. Note that while signed, \
the data is not encrypted, so don't use it to send secrets over clear \
channels."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.09"

RPM_NAME = "perl-Mojo-JWT-0.09-1.2.noarch.rpm"
RPM_HASH = "d5ecbdfca7621e314f5f8321e4cc38ee2a85a6f0bd8a9b9f0238722a6468bdda24037db6a413e186bf4a5d408d50243c68a405336fa480a4348c5df356db67c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Mojo::JWT) \
perl-Mojo-JWT"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Digest::SHA) \
perl(MIME::Base64) \
perl(Mojolicious)"

inherit rpm
