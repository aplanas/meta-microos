SUMMARY = "OpenID Connect Provider implementation for Django"
DESCRIPTION = "OpenID Connect Provider implementation for Django."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python311-django-oidc-provider-0.7.0-3.7.noarch.rpm"
RPM_HASH = "f4f23eb31e81de88e8feab2be3437c2ad18dccdea4912045e85ac7750576e3d8982883cb9e0d8bcb806975a3f66683ed2ce9860423bbfaaf1080b79f36af343b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-oidc-provider \
python3.11dist-django-oidc-provider \
python311-django-oidc-provider \
python3dist-django-oidc-provider"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-pyjwkest"

inherit rpm
