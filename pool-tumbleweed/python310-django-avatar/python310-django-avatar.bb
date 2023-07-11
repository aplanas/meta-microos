SUMMARY = "Django-avatar package"
DESCRIPTION = "Django-avatar is a reusable application for handling user avatars.  It has the \
ability to default to Gravatar_ if no avatar is found for a certain user. \
Django-avatar automatically generates thumbnails and stores them to your default \
file storage backend for retrieval later."
LICENSE = "BSD-3-Clause"

PV = "7.1.1"

RPM_NAME = "python310-django-avatar-7.1.1-1.4.noarch.rpm"
RPM_HASH = "15e55432e968b27010afd6693b680e78de605e49547dee7216cd8ceb4e5bbcef4d8c332918f9a11a504a8eb872743af31d6f0cf384954095fbb054d92853ae56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-avatar \
python310-django-avatar \
python3dist-django-avatar"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-Pillow \
python310-django-appconf \
python310-dnspython"

inherit rpm
