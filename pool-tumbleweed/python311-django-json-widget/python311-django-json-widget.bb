SUMMARY = "Django JSON widget for editing the Django jsonfield"
DESCRIPTION = "Django json widget is an alternative widget that makes it easy to edit the \
jsonfield field of django."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python311-django-json-widget-1.1.1-2.1.noarch.rpm"
RPM_HASH = "be960ec0190345f5a824725faa96565d889029cbd2ab45542ba2a0dd56e1e93034cd144688ca0939d17fac131a01d0f6674c764522d12403a716677bc8173464"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-json-widget \
python3.11dist-django-json-widget \
python311-django-json-widget \
python3dist-django-json-widget"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-future"

inherit rpm
