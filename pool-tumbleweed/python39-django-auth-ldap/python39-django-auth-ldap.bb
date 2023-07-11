SUMMARY = "Django LDAP authentication backend"
DESCRIPTION = "This is a Django authentication backend that authenticates against an LDAP service. \
Configuration can be as simple as a single distinguished name template, but there \
are many rich configuration options for working with users, groups, and permissions."
LICENSE = "BSD-2-Clause"

PV = "4.0.0"

RPM_NAME = "python39-django-auth-ldap-4.0.0-1.14.noarch.rpm"
RPM_HASH = "e00ec448de025b7f1837fbf97dcb8f94cc5763febb4968fc33c3177fec5a12f5e6d3a460e79f7d13acfb0632b89a20c1a5e35a1022884188ee652d66c2207cef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-auth-ldap \
python39-django-auth-ldap \
python3dist-django-auth-ldap"

RDEPENDS:${PN} += "python-abi \
python39-Django \
python39-ldap"

inherit rpm
