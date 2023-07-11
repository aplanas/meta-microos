SUMMARY = "Django JSON widget for editing the Django jsonfield"
DESCRIPTION = "Django json widget is an alternative widget that makes it easy to edit the \
jsonfield field of django."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python39-django-json-widget-1.1.1-2.1.noarch.rpm"
RPM_HASH = "51f0275525e694d7a7735f262b519dd77d1a5e250ad68acb6f52a6b53cebf0fbcbb6972927cc4b8d151d87849de80ea850b72e6d7b151c6fdc16fceb2aec55b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-json-widget \
python39-django-json-widget \
python3dist-django-json-widget"

RDEPENDS:${PN} += "python-abi \
python39-Django \
python39-future"

inherit rpm
