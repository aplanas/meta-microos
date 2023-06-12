SUMMARY = "Django LDAP authentication backend"
DESCRIPTION = "This is a Django authentication backend that authenticates against an LDAP service. \
Configuration can be as simple as a single distinguished name template, but there \
are many rich configuration options for working with users, groups, and permissions."
LICENSE = "BSD-2-Clause"

PV = "4.0.0"

RPM_NAME = "python311-django-auth-ldap-4.0.0-1.12.noarch.rpm"
RPM_HASH = "35d342a6a3bd8f3c2e7a27dee8855ff4a245e7b100e50f0e9f94a957e9a8aed2d67753eddf1ac703931220836ffe372734d62a91a7195d6d89d25531ae78af97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-auth-ldap) \
python311-django-auth-ldap \
python3dist(django-auth-ldap)"
RDEPENDS:${PN} += "python(abi) \
python311-Django \
python311-ldap"

inherit rpm
