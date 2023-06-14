SUMMARY = "Django-avatar package"
DESCRIPTION = "Django-avatar is a reusable application for handling user avatars.  It has the \
ability to default to Gravatar_ if no avatar is found for a certain user. \
Django-avatar automatically generates thumbnails and stores them to your default \
file storage backend for retrieval later."
LICENSE = "BSD-3-Clause"

PV = "7.1.1"

RPM_NAME = "python311-django-avatar-7.1.1-1.2.noarch.rpm"
RPM_HASH = "7ac09aad946362f5008210f3232bf237ad266ecfe9232bf4d69d7ed498dc1b6b89122ff7465e904fdfabb76198c97210fc22b6c39ba034b7904302549b65d5d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-django-avatar \
python311-django-avatar \
python3dist-django-avatar"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-Pillow \
python311-django-appconf \
python311-dnspython"

inherit rpm
