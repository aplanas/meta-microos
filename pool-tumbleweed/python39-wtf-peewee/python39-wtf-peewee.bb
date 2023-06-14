SUMMARY = "WTForms integration for peewee models"
DESCRIPTION = "wtf-peewee provides a bridge between peewee models and wtforms, mapping \
model fields to form fields."
LICENSE = "MIT"

PV = "3.0.4"

RPM_NAME = "python39-wtf-peewee-3.0.4-1.10.noarch.rpm"
RPM_HASH = "30465ceaca5ee52b5ad066ae6ee987bf7b19acbf54797f4a2614f2a83d38c14ebcb1c49a26f4895dc318ec261fcd602f11c62151fe82371185271f82aff59be0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-wtf-peewee \
python39-wtf-peewee \
python3dist-wtf-peewee"

RDEPENDS:${PN} += "python-abi \
python39-WTForms \
python39-peewee"

inherit rpm
