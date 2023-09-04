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

RPM_NAME = "perl-Mojo-JWT-0.09-1.4.noarch.rpm"
RPM_HASH = "047bc7d6ec4518fd7de0a8a2cf531a4c02533469064d33ca4d85da3b29599af2fcfc5cf3fd1838ae4ab2cb6711d3838af41398537dd70a03671f689ec71cd304"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mojo--JWT \
perl-Mojo-JWT"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Digest--SHA \
perl-MIME--Base64 \
perl-Mojolicious"

inherit rpm
