SUMMARY = "Framework for attaching comments to Django models"
DESCRIPTION = "This framework can be used to attach comments to any model, so you can use \
it for comments on blog entries, photos, book chapters, or anything else. \
 \
This is the same framework that was removed from Django 1.6."
LICENSE = "BSD-3-Clause"

PV = "2.2.0"

RPM_NAME = "python311-django-contrib-comments-2.2.0-1.5.noarch.rpm"
RPM_HASH = "2418a04aff7a01b3a92ffd5ed4034d1451a5ec41b26d2052d80459456689c3e02877fa1139a8235d79250fe39e0d026e3e006de8c5fe52bdc9b7f32817bfb12c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-contrib-comments \
python3.11dist-django-contrib-comments \
python311-django-contrib-comments \
python3dist-django-contrib-comments"

RDEPENDS:${PN} += "python-abi \
python311-Django"

inherit rpm
