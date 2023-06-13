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

RPM_NAME = "python311-flask-jwt-extended-4.3.1-1.6.noarch.rpm"
RPM_HASH = "9f4d5f32642cf381d8337cd25174f0749020a699fde955bd27cf5ef8bd57706267041bdc3e95efa8d2dfc7c8b23b44ceaf015114fecb8fec5c7e6455f42fa802"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(flask-jwt-extended) \
python311-flask-jwt-extended \
python3dist(flask-jwt-extended)"

RDEPENDS:${PN} += "python(abi) \
python311-Flask \
python311-PyJWT \
python311-Werkzeug"

inherit rpm
