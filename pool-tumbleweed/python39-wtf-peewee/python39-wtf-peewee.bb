SUMMARY = "WTForms integration for peewee models"
DESCRIPTION = "wtf-peewee provides a bridge between peewee models and wtforms, mapping \
model fields to form fields."
LICENSE = "MIT"

PV = "3.0.4"

RPM_NAME = "python39-wtf-peewee-3.0.4-1.12.noarch.rpm"
RPM_HASH = "e6828165d5b3da71551892eae20d96de2de4d36cd862f2b81cf9deebdb0927edeef5cc415746588fc81dd56fa691abcde3479edd9801240476cf0c2259570943"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-wtf-peewee \
python39-wtf-peewee \
python3dist-wtf-peewee"

RDEPENDS:${PN} += "python-abi \
python39-WTForms \
python39-peewee"

inherit rpm
