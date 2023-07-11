SUMMARY = "Django utility application that returns client's real IP address"
DESCRIPTION = "A Django utility application that returns client's real IP address."
LICENSE = "MIT"

PV = "5.0.0"

RPM_NAME = "python310-django-ipware-5.0.0-1.3.noarch.rpm"
RPM_HASH = "d835dc47bf4618b650521415a9b029d785ed38cf4117582db49faf20fcddf730e1dd83d2c18d2f42c4d900aa3ae4ba187f601a386be17911396bf605dd04e591"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-ipware \
python310-django-ipware \
python3dist-django-ipware"

RDEPENDS:${PN} += "python-abi \
python310-Django"

inherit rpm
