SUMMARY = "Django admin CKEditor integration"
DESCRIPTION = "Django admin CKEditor integration. Provides a RichTextField and \
CKEditorWidget utilizing CKEditor with image upload and browsing \
support included."
LICENSE = "BSD-3-Clause"

PV = "6.6.1"

RPM_NAME = "python311-django-ckeditor-6.6.1-1.1.noarch.rpm"
RPM_HASH = "e3341ba1426251f2a1b647537ae55f901b2b8dccfca414d117fd21e8b0e78be169a67b3d38cc37d857e4ac1ca1a789901a9ae5dbda9ddb06bcaa38c9a865956b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-ckeditor \
python3.11dist-django-ckeditor \
python311-django-ckeditor \
python3dist-django-ckeditor"

RDEPENDS:${PN} += "python-abi \
python311-Pillow \
python311-django-js-asset"

inherit rpm
