SUMMARY = "Python Social Authentication, Django integration"
DESCRIPTION = "This is the Django component of the python-social-auth ecosystem, \
it implements the needed functionality to integrate social-auth-core \
in a Django based project."
LICENSE = "BSD-3-Clause"

PV = "5.0.0"

RPM_NAME = "python310-social-auth-app-django-5.0.0-3.4.noarch.rpm"
RPM_HASH = "344900996a170fdd7e02df1d19c7c843bc0f17effdfe0372e03d76d2b00c0245fccaa95f82560030a73d720e3821772664895743669a688f03f12aa3ffeecd7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-social-auth-app-django \
python310-social-auth-app-django \
python3dist-social-auth-app-django"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-python-jose \
python310-social-auth-core"

inherit rpm
