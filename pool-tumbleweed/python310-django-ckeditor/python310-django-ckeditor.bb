SUMMARY = "Django admin CKEditor integration"
DESCRIPTION = "Django admin CKEditor integration. Provides a RichTextField and \
CKEditorWidget utilizing CKEditor with image upload and browsing \
support included."
LICENSE = "BSD-3-Clause"

PV = "6.6.1"

RPM_NAME = "python310-django-ckeditor-6.6.1-1.1.noarch.rpm"
RPM_HASH = "ee1a0e3cfddda5520ab7df1448f7f0a508bf98e5ebbd0fcdc5661089afa776d0e5b9a66b2b5eb3a93b5962f46bca13010de098c4fa0140abe7b118de12147d98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-ckeditor \
python310-django-ckeditor \
python3dist-django-ckeditor"

RDEPENDS:${PN} += "python-abi \
python310-Pillow \
python310-django-js-asset"

inherit rpm
