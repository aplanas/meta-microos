SUMMARY = "Extended session backends for Django"
DESCRIPTION = "Extended session backends for Django."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "python311-django-qsessions-1.1.4-1.5.noarch.rpm"
RPM_HASH = "5369aa32ab1cb9aebf8124e4cfd3cd1e09682ec369ad2e642c18142bdaffac21b582f25a21e133bf3a457f0be4b418d6d01145e4b982ba42dfc77d02fe03e189"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-qsessions \
python3.11dist-django-qsessions \
python311-django-qsessions \
python3dist-django-qsessions"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-django-ipware \
python311-user-agents"

inherit rpm
