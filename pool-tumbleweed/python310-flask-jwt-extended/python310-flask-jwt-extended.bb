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

RPM_NAME = "python310-flask-jwt-extended-4.5.2-1.1.noarch.rpm"
RPM_HASH = "7966a94e9fee21402c9a87d0442320aa1a3922bd8137e8cd9aaeb441011723776a84a8b0699b19b7c8db7987e50d096dc0b5a599f2fc4cbc7c7b01a7983c3264"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flask-jwt-extended \
python310-flask-jwt-extended \
python3dist-flask-jwt-extended"

RDEPENDS:${PN} += "python-abi \
python310-Flask \
python310-PyJWT \
python310-Werkzeug"

inherit rpm
