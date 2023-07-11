SUMMARY = "Django-avatar package"
DESCRIPTION = "Django-avatar is a reusable application for handling user avatars.  It has the \
ability to default to Gravatar_ if no avatar is found for a certain user. \
Django-avatar automatically generates thumbnails and stores them to your default \
file storage backend for retrieval later."
LICENSE = "BSD-3-Clause"

PV = "7.1.1"

RPM_NAME = "python39-django-avatar-7.1.1-1.4.noarch.rpm"
RPM_HASH = "dec8ae809f3297376d6683832ccde40c4bd45995940fe4698aa7902bb0cc4a345b30508afc1662cf83fb6c4db3a6af56ef9b587b1a5d70dcdab4de97fca148b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-avatar \
python39-django-avatar \
python3dist-django-avatar"

RDEPENDS:${PN} += "python-abi \
python39-Django \
python39-Pillow \
python39-django-appconf \
python39-dnspython"

inherit rpm
