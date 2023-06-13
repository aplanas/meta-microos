SUMMARY = "A Flask extension that provides JWT support"
DESCRIPTION = "Flask-JWT-Extended not only adds support for using JSON Web Tokens \
(JWT) to Flask for protecting views, but also many \
(optional) features built in to make working with JSON \
Web Tokens easier. These include: \
 \
- Support for adding custom claims to JSON Web Tokens \
- Custom claims validation on received tokens \
- Creating tokens from complex objects or complex object from received tokens \
- Refresh tokens \
- Token freshness and separate view decorators to only allow fresh tokens \
- Token revoking/blacklisting \
- Storing tokens in cookies and CSRF protection"
LICENSE = "MIT"

PV = "4.3.1"

RPM_NAME = "python310-flask-jwt-extended-4.3.1-1.6.noarch.rpm"
RPM_HASH = "ab85c10917f2b78fb0f87394b079ba90417a99c4efc73de2c8eb8273415795a8458209fd0f1a44c9cbcb3645c04d434edd0dac670d2755c8ca577398ac402f9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flask-jwt-extended \
python3.10dist(flask-jwt-extended) \
python310-flask-jwt-extended \
python3dist(flask-jwt-extended)"

RDEPENDS:${PN} += "python(abi) \
python310-Flask \
python310-PyJWT \
python310-Werkzeug"

inherit rpm
