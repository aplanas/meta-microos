SUMMARY = "OpenID Connect Provider implementation for Django"
DESCRIPTION = "OpenID Connect Provider implementation for Django."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python39-django-oidc-provider-0.7.0-3.4.noarch.rpm"
RPM_HASH = "c104e620f874c7392c01ddeafe572176c277bb70cbb3038c97036c0aa2ae7a30241c6e381f8c08e62ac4f341e24c7d128220ca45201cfdc1fa631cc5002bef1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-oidc-provider) \
python39-django-oidc-provider \
python3dist(django-oidc-provider)"
RDEPENDS:${PN} += "python(abi) \
python39-Django \
python39-pyjwkest"

inherit rpm
