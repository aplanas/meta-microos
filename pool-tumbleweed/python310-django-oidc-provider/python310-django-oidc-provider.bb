SUMMARY = "OpenID Connect Provider implementation for Django"
DESCRIPTION = "OpenID Connect Provider implementation for Django."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python310-django-oidc-provider-0.7.0-3.4.noarch.rpm"
RPM_HASH = "b4a3329726ebfd5eb6ee011437b9e1451a1ac9078079f2b01c5b0639629c64305ad5423dcd0b0368118dc28f713f33c0ebf4a7cb554bdf0e9b0742ed7f8539c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-oidc-provider \
python3.10dist(django-oidc-provider) \
python310-django-oidc-provider \
python3dist(django-oidc-provider)"
RDEPENDS:${PN} += "python(abi) \
python310-Django \
python310-pyjwkest"

inherit rpm
