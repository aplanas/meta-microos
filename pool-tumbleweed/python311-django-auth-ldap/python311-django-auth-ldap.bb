SUMMARY = "Django LDAP authentication backend"
DESCRIPTION = "This is a Django authentication backend that authenticates against an LDAP service. \
Configuration can be as simple as a single distinguished name template, but there \
are many rich configuration options for working with users, groups, and permissions."
LICENSE = "BSD-2-Clause"

PV = "4.0.0"

RPM_NAME = "python311-django-auth-ldap-4.0.0-1.14.noarch.rpm"
RPM_HASH = "528b5afb9375db948c3d1a79c438de22aa24b495b49715725e2878f95b61a15456eccbb1312075ae29d16d65b990996ab01a8727932d9cbb394b5ea4372420c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-auth-ldap \
python3.11dist-django-auth-ldap \
python311-django-auth-ldap \
python3dist-django-auth-ldap"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-ldap"

inherit rpm
