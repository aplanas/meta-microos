SUMMARY = "Python Social Authentication, Django integration"
DESCRIPTION = "This is the Django component of the python-social-auth ecosystem, \
it implements the needed functionality to integrate social-auth-core \
in a Django based project."
LICENSE = "BSD-3-Clause"

PV = "5.0.0"

RPM_NAME = "python311-social-auth-app-django-5.0.0-3.4.noarch.rpm"
RPM_HASH = "31da05ae7d78004b0dd0d793904da9ae62ac74b5171fc4a3a1fa2e2ed44d0b64c685294cd5f5eb9abd2b9299f8cda1af5c91e77a76024d52e4b23496ca7f6dd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-social-auth-app-django \
python3.11dist-social-auth-app-django \
python311-social-auth-app-django \
python3dist-social-auth-app-django"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-python-jose \
python311-social-auth-core"

inherit rpm
