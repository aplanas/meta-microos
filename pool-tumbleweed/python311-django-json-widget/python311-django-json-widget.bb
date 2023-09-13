SUMMARY = "Django JSON widget for editing the Django jsonfield"
DESCRIPTION = "Django json widget is an alternative widget that makes it easy to edit the \
jsonfield field of django."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python311-django-json-widget-1.1.1-3.1.noarch.rpm"
RPM_HASH = "b63d3ce8cb1533b7170262f3ab7b1bd98b2f2b0864d20acedf6fb0cd2bb3444f7c16b5beb610aa9bb91d6b642dc44b00073aeb2210061ffb6176b52100083c84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-json-widget \
python3.11dist-django-json-widget \
python311-django-json-widget \
python3dist-django-json-widget"

RDEPENDS:${PN} += "python-abi \
python311-Django"

inherit rpm
