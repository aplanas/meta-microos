SUMMARY = "Django JSON widget for editing the Django jsonfield"
DESCRIPTION = "Django json widget is an alternative widget that makes it easy to edit the \
jsonfield field of django."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python310-django-json-widget-1.1.1-2.1.noarch.rpm"
RPM_HASH = "6b89843899a28e105eb6e5cd1d8d3a63010b03eb5c46098b73c9c281be8b00f689c5dcffaade470b2161977a3a317a6955f985a58f9387413ad492c37e6e009b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-json-widget \
python310-django-json-widget \
python3dist-django-json-widget"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-future"

inherit rpm
