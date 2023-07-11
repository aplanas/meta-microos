SUMMARY = "OpenID Connect Provider implementation for Django"
DESCRIPTION = "OpenID Connect Provider implementation for Django."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python39-django-oidc-provider-0.7.0-3.7.noarch.rpm"
RPM_HASH = "1e07893273a84e9ecf7c2122cdc5caef49b91ae769af8d0d4250043564e04eaaaa9cc8a85394ddb80e3edd3ce49e0cfafe08fa5ca6cbb3396750377e1c230763"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-oidc-provider \
python39-django-oidc-provider \
python3dist-django-oidc-provider"

RDEPENDS:${PN} += "python-abi \
python39-Django \
python39-pyjwkest"

inherit rpm
