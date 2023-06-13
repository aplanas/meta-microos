SUMMARY = "Django admin CKEditor integration"
DESCRIPTION = "Django admin CKEditor integration. Provides a RichTextField and \
CKEditorWidget utilizing CKEditor with image upload and browsing \
support included."
LICENSE = "BSD-3-Clause"

PV = "6.5.1"

RPM_NAME = "python39-django-ckeditor-6.5.1-1.3.noarch.rpm"
RPM_HASH = "f437716def7e8dc72df11e35ee9e20335f384085ac5f93148c8ec28d18fb1316c4044ab6b8e3e40724f8aa83879bfe584dc2dabf9553045aff53a1955eac9e59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-ckeditor) \
python39-django-ckeditor \
python3dist(django-ckeditor)"

RDEPENDS:${PN} += "python(abi) \
python39-Pillow \
python39-django-js-asset"

inherit rpm
