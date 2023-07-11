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

RPM_NAME = "perl-Mojo-JWT-0.09-1.3.noarch.rpm"
RPM_HASH = "cf6cb9050dde2c308ad6bf8d77b40c6be5c13cd0f2b2ab490dd142fc8fe9151a7298353ddd7da57e2b5766a6661691414d886b7230ed1b92e8eec755936598b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mojo--JWT \
perl-Mojo-JWT"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Digest--SHA \
perl-MIME--Base64 \
perl-Mojolicious"

inherit rpm
