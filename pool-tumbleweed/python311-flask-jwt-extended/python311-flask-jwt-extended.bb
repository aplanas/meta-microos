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

PV = "4.5.2"

RPM_NAME = "python311-flask-jwt-extended-4.5.2-1.1.noarch.rpm"
RPM_HASH = "7a732033701e2489de24e25c7b35685c65c1d06c93a4ce8e58b32de2f9af6ed555019cd223737cd9cebf31022e3657961ff3cb47e76334b9efc9ca839c7756dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flask-jwt-extended \
python3.11dist-flask-jwt-extended \
python311-flask-jwt-extended \
python3dist-flask-jwt-extended"

RDEPENDS:${PN} += "python-abi \
python311-Flask \
python311-PyJWT \
python311-Werkzeug"

inherit rpm
