SUMMARY = "Django admin CKEditor integration"
DESCRIPTION = "Django admin CKEditor integration. Provides a RichTextField and \
CKEditorWidget utilizing CKEditor with image upload and browsing \
support included."
LICENSE = "BSD-3-Clause"

PV = "6.5.1"

RPM_NAME = "python311-django-ckeditor-6.5.1-1.3.noarch.rpm"
RPM_HASH = "15d6902c125afea455a5a05817bc03e60d324fee9a88cf4aaa6b976ef5f2b0803e0aea850d22fbd3100caae082b183ba72717ab380da5fa74a44bc7f3724c6c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-ckeditor) \
python311-django-ckeditor \
python3dist(django-ckeditor)"
RDEPENDS:${PN} += "python(abi) \
python311-Pillow \
python311-django-js-asset"

inherit rpm
