SUMMARY = "Django admin CKEditor integration"
DESCRIPTION = "Django admin CKEditor integration. Provides a RichTextField and \
CKEditorWidget utilizing CKEditor with image upload and browsing \
support included."
LICENSE = "BSD-3-Clause"

PV = "6.6.1"

RPM_NAME = "python39-django-ckeditor-6.6.1-1.1.noarch.rpm"
RPM_HASH = "b198cfc013d6df04d3f0019889433fe3945c6b1e8fb78d95906bb67b1ecbaba475f222e94c0ff28abd3468337bf0106bba9c9e5377671f3c2aa46c8e870b848f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-ckeditor \
python39-django-ckeditor \
python3dist-django-ckeditor"

RDEPENDS:${PN} += "python-abi \
python39-Pillow \
python39-django-js-asset"

inherit rpm
