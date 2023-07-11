SUMMARY = "JSON Web Token for Django GraphQL"
DESCRIPTION = "JSON Web Token for Django GraphQL"
LICENSE = "MIT"

PV = "0.3.4"

RPM_NAME = "python311-django-graphql-jwt-0.3.4-1.1.noarch.rpm"
RPM_HASH = "cdf7537d864b5758c47afe7a09ea4cae14935886f8ed19377269acf674363588712352ca95bb0bf01ae4f7e887d9631ce01332300cee7c0c336b67ba7b157933"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-graphql-jwt \
python3.11dist-django-graphql-jwt \
python311-django-graphql-jwt \
python3dist-django-graphql-jwt"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-PyJWT \
python311-graphene \
python311-graphene-django"

inherit rpm
