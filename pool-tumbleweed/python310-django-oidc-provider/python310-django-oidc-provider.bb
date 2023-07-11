SUMMARY = "OpenID Connect Provider implementation for Django"
DESCRIPTION = "OpenID Connect Provider implementation for Django."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python310-django-oidc-provider-0.7.0-3.7.noarch.rpm"
RPM_HASH = "b052c18f3fcd329c9d472e97f202c0fc188b9d8ccc43b68e80585374f620ba11e52dd5b14f201544f0ac7704904d0997cd3d49017c1cd2243f39eacf918659c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-oidc-provider \
python310-django-oidc-provider \
python3dist-django-oidc-provider"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-pyjwkest"

inherit rpm
