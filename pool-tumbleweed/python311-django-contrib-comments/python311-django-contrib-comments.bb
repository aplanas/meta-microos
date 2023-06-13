SUMMARY = "Framework for attaching comments to Django models"
DESCRIPTION = "This framework can be used to attach comments to any model, so you can use \
it for comments on blog entries, photos, book chapters, or anything else. \
 \
This is the same framework that was removed from Django 1.6."
LICENSE = "BSD-3-Clause"

PV = "2.2.0"

RPM_NAME = "python311-django-contrib-comments-2.2.0-1.3.noarch.rpm"
RPM_HASH = "07b7368c4c9a6c36b086ab0ec406a174326a0c6dea5992048504ab8b8dc28990e39169c6c4a0125da0878ec71eb97d51288b7abc4767f2cba1cc1c1ece4f8d4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-contrib-comments) \
python311-django-contrib-comments \
python3dist(django-contrib-comments)"

RDEPENDS:${PN} += "python(abi) \
python311-Django"

inherit rpm
