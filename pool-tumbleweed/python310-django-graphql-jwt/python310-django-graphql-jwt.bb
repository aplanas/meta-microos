SUMMARY = "JSON Web Token for Django GraphQL"
DESCRIPTION = "JSON Web Token for Django GraphQL"
LICENSE = "MIT"

PV = "0.3.4"

RPM_NAME = "python310-django-graphql-jwt-0.3.4-1.1.noarch.rpm"
RPM_HASH = "bbe361690c513fc5b2a9e5f10ee53f0933fe65f228ae824fcb410d53673096fdfdefc7c988b3ba9ae1a4994b00d8a404265712ef89ed1f19c331a1fd1c06a919"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-graphql-jwt \
python310-django-graphql-jwt \
python3dist-django-graphql-jwt"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-PyJWT \
python310-graphene \
python310-graphene-django"

inherit rpm
