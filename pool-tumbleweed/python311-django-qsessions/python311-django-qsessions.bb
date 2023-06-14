SUMMARY = "Extended session backends for Django"
DESCRIPTION = "Extended session backends for Django."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "python311-django-qsessions-1.1.4-1.3.noarch.rpm"
RPM_HASH = "ae0fae2a847b7e054390689b0bae6f318de8739fa8b17326d15ce41ebc1ab5f9f1798d0206a48538732b2e972d1dec3a18628e480784411623ddfbc1cd3b6a63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-django-qsessions \
python311-django-qsessions \
python3dist-django-qsessions"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-django-ipware \
python311-user-agents"

inherit rpm
