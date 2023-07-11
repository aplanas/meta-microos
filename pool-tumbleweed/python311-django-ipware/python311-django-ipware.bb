SUMMARY = "Django utility application that returns client's real IP address"
DESCRIPTION = "A Django utility application that returns client's real IP address."
LICENSE = "MIT"

PV = "5.0.0"

RPM_NAME = "python311-django-ipware-5.0.0-1.3.noarch.rpm"
RPM_HASH = "2415d212534e220e264b2e89169af41e5e475701b13d0ec4f96853fe512c62d93ddef141e02c03f55dc830ddd223b8476cb8eda757ed4f20245b5bc655ec11e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-ipware \
python3.11dist-django-ipware \
python311-django-ipware \
python3dist-django-ipware"

RDEPENDS:${PN} += "python-abi \
python311-Django"

inherit rpm
