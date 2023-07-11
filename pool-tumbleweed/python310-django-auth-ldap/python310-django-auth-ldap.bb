SUMMARY = "Django LDAP authentication backend"
DESCRIPTION = "This is a Django authentication backend that authenticates against an LDAP service. \
Configuration can be as simple as a single distinguished name template, but there \
are many rich configuration options for working with users, groups, and permissions."
LICENSE = "BSD-2-Clause"

PV = "4.0.0"

RPM_NAME = "python310-django-auth-ldap-4.0.0-1.14.noarch.rpm"
RPM_HASH = "6a610fe4d841710526f82bdc714f3981607d5a22e177cdb1bc8c224e812715a35dafd2ef909823a14f8b4586795f18f29cd53b99b3e34acceb19b314d803eea9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-auth-ldap \
python310-django-auth-ldap \
python3dist-django-auth-ldap"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-ldap"

inherit rpm
