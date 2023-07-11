SUMMARY = "WTForms integration for peewee models"
DESCRIPTION = "wtf-peewee provides a bridge between peewee models and wtforms, mapping \
model fields to form fields."
LICENSE = "MIT"

PV = "3.0.4"

RPM_NAME = "python310-wtf-peewee-3.0.4-1.12.noarch.rpm"
RPM_HASH = "9b582158580ef33d1e3d28fc6dc081d64f1b31296d88cc4b0143d0c57281de694cc46099f034964a9fc5efebaf385cd4f676910fe2ee79329bf301fbf961738d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-wtf-peewee \
python310-wtf-peewee \
python3dist-wtf-peewee"

RDEPENDS:${PN} += "python-abi \
python310-WTForms \
python310-peewee"

inherit rpm
