SUMMARY = "Django JSON widget for editing the Django jsonfield"
DESCRIPTION = "Django json widget is an alternative widget that makes it easy to edit the \
jsonfield field of django."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python311-django-json-widget-1.1.1-1.4.noarch.rpm"
RPM_HASH = "37a89f8f372cc2404a7765ce4207087cce9b64fca9b63e58201d6a869dd0ac83f9334480b56ebce8ced6c2ab1cdd9436940ad18190741b21ef64c69b27e42c36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-django-json-widget \
python311-django-json-widget \
python3dist-django-json-widget"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-future"

inherit rpm
