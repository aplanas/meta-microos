SUMMARY = "Python Social Authentication, Django integration"
DESCRIPTION = "This is the Django component of the python-social-auth ecosystem, \
it implements the needed functionality to integrate social-auth-core \
in a Django based project."
LICENSE = "BSD-3-Clause"

PV = "5.0.0"

RPM_NAME = "python39-social-auth-app-django-5.0.0-3.4.noarch.rpm"
RPM_HASH = "643d9567461cc35e45399bbb30570d7eb80e8a022dc01a7675c00a4ea0a95547f1d0b7f7979a5509bbe64096ccdcfa310d75dcf80da60f347da8b64e1e932b23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-social-auth-app-django \
python39-social-auth-app-django \
python3dist-social-auth-app-django"

RDEPENDS:${PN} += "python-abi \
python39-Django \
python39-python-jose \
python39-social-auth-core"

inherit rpm
