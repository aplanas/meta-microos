SUMMARY = "Django-taggit is a reusable Django application for simple tagging"
DESCRIPTION = "Django-taggit is a reusable Django application for simple tagging."
LICENSE = "BSD-3-Clause-Clear"

PV = "4.0.0"

RPM_NAME = "python310-django-taggit-4.0.0-1.3.noarch.rpm"
RPM_HASH = "5b0ae923184bc99a4fcbfec0eb3dcd7cf008b1a336cbb58f74f6ed065ef85567938076cf6298819c09de034c739ba47c3f96af33e3454fa8b07f5e6d1d9b923c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-taggit \
python310-django-taggit \
python3dist-django-taggit"

RDEPENDS:${PN} += "python-abi \
python310-Django"

inherit rpm
