SUMMARY = "WTForms integration for peewee models"
DESCRIPTION = "wtf-peewee provides a bridge between peewee models and wtforms, mapping \
model fields to form fields."
LICENSE = "MIT"

PV = "3.0.4"

RPM_NAME = "python311-wtf-peewee-3.0.4-1.12.noarch.rpm"
RPM_HASH = "b0f07f7ee328798eab67446d58e02ea7991edd7f4657ddb958f26c29e90bbd61441ea08a25a87f6276ed5185e5a77a2ad89473752f34303659b2681ee0457a0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-wtf-peewee \
python3.11dist-wtf-peewee \
python311-wtf-peewee \
python3dist-wtf-peewee"

RDEPENDS:${PN} += "python-abi \
python311-WTForms \
python311-peewee"

inherit rpm
