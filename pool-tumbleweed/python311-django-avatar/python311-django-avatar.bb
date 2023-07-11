SUMMARY = "Django-avatar package"
DESCRIPTION = "Django-avatar is a reusable application for handling user avatars.  It has the \
ability to default to Gravatar_ if no avatar is found for a certain user. \
Django-avatar automatically generates thumbnails and stores them to your default \
file storage backend for retrieval later."
LICENSE = "BSD-3-Clause"

PV = "7.1.1"

RPM_NAME = "python311-django-avatar-7.1.1-1.4.noarch.rpm"
RPM_HASH = "f1a6fbe7908ba1679b706e115e887b7e584d47dae36edff7ac3e749917d9e020c787bb31b87047b651b65f91af34be5264b2bd8672363c6786f3000b2e64aa26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-avatar \
python3.11dist-django-avatar \
python311-django-avatar \
python3dist-django-avatar"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-Pillow \
python311-django-appconf \
python311-dnspython"

inherit rpm
