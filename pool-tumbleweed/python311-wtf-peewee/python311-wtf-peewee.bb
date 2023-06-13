SUMMARY = "WTForms integration for peewee models"
DESCRIPTION = "wtf-peewee provides a bridge between peewee models and wtforms, mapping \
model fields to form fields."
LICENSE = "MIT"

PV = "3.0.4"

RPM_NAME = "python311-wtf-peewee-3.0.4-1.10.noarch.rpm"
RPM_HASH = "06cf5103b4a8816d6cfd3026db403c96ce702717b75a1f5a65d2c4699482e0334c9f05ca97f957414cd8cbab3038edae4f602265c8f0ebb43ece7a6a43d5b19c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(wtf-peewee) \
python311-wtf-peewee \
python3dist(wtf-peewee)"

RDEPENDS:${PN} += "python(abi) \
python311-WTForms \
python311-peewee"

inherit rpm
