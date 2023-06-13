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

RPM_NAME = "python39-flask-jwt-extended-4.3.1-1.6.noarch.rpm"
RPM_HASH = "56385ad5754d2ed5cdc02efe484344bbf95aebfcd08a2ff3d11be5c10fbcd4270e168292276f4ccea0b7825403fcf0e2f281c77d1cdd224f6ab0a1f975c39e9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(flask-jwt-extended) \
python39-flask-jwt-extended \
python3dist(flask-jwt-extended)"

RDEPENDS:${PN} += "python(abi) \
python39-Flask \
python39-PyJWT \
python39-Werkzeug"

inherit rpm
