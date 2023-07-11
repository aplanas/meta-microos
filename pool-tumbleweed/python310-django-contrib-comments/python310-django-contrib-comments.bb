SUMMARY = "Framework for attaching comments to Django models"
DESCRIPTION = "This framework can be used to attach comments to any model, so you can use \
it for comments on blog entries, photos, book chapters, or anything else. \
 \
This is the same framework that was removed from Django 1.6."
LICENSE = "BSD-3-Clause"

PV = "2.2.0"

RPM_NAME = "python310-django-contrib-comments-2.2.0-1.5.noarch.rpm"
RPM_HASH = "a8f53ea741219907713525adb4d8de5e17c66ef65e57558504a4348d5c3342bff273c198898d5f1a53e6eed9ae1f91db15e1cec17edb51a4352f32b5c868149d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-contrib-comments \
python310-django-contrib-comments \
python3dist-django-contrib-comments"

RDEPENDS:${PN} += "python-abi \
python310-Django"

inherit rpm
