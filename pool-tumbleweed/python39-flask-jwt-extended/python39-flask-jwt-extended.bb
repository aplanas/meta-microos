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

RPM_NAME = "python39-flask-jwt-extended-4.5.2-1.1.noarch.rpm"
RPM_HASH = "1a6bb7cbfd20c4019fa6198975a89f895c8232b6ff6c777d543789cd2eaa3421493b0ddda182f915a7cbf3e86566d3c7534779a8cdd33e9d0f89389b584b68e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flask-jwt-extended \
python39-flask-jwt-extended \
python3dist-flask-jwt-extended"

RDEPENDS:${PN} += "python-abi \
python39-Flask \
python39-PyJWT \
python39-Werkzeug"

inherit rpm
