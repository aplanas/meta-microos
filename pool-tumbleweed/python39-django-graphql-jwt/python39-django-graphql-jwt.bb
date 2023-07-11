SUMMARY = "JSON Web Token for Django GraphQL"
DESCRIPTION = "JSON Web Token for Django GraphQL"
LICENSE = "MIT"

PV = "0.3.4"

RPM_NAME = "python39-django-graphql-jwt-0.3.4-1.1.noarch.rpm"
RPM_HASH = "8d9c8dde7fd1ce40afdc460648f695484edef46c64d6692152e063da1568a896706d15087e8a7fd14da13a39f0fe96172971db3afeee37d0dbe5c494e8555a7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-graphql-jwt \
python39-django-graphql-jwt \
python3dist-django-graphql-jwt"

RDEPENDS:${PN} += "python-abi \
python39-Django \
python39-PyJWT \
python39-graphene \
python39-graphene-django"

inherit rpm
