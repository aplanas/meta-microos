SUMMARY = "Framework for attaching comments to Django models"
DESCRIPTION = "This framework can be used to attach comments to any model, so you can use \
it for comments on blog entries, photos, book chapters, or anything else. \
 \
This is the same framework that was removed from Django 1.6."
LICENSE = "BSD-3-Clause"

PV = "2.2.0"

RPM_NAME = "python39-django-contrib-comments-2.2.0-1.5.noarch.rpm"
RPM_HASH = "9201269fe85fd88eaea127feb059eb26beb3f93e96e3ee5754b1ccd0037c000aef2964caee5fc109b7568901bc26b86357178ad8c3ff50dd62163e0d38c3d9da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-contrib-comments \
python39-django-contrib-comments \
python3dist-django-contrib-comments"

RDEPENDS:${PN} += "python-abi \
python39-Django"

inherit rpm
