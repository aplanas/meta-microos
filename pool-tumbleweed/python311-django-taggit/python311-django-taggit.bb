SUMMARY = "Django-taggit is a reusable Django application for simple tagging"
DESCRIPTION = "Django-taggit is a reusable Django application for simple tagging."
LICENSE = "BSD-3-Clause-Clear"

PV = "4.0.0"

RPM_NAME = "python311-django-taggit-4.0.0-1.3.noarch.rpm"
RPM_HASH = "561dc504242ae47d77474a102b72052bae22209cab059f06f52c7e6486ed5a40f6cd84f91db3cacac0bebace303d83055fde1f32f6548d84d84264fa1f4cdf31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-taggit \
python3.11dist-django-taggit \
python311-django-taggit \
python3dist-django-taggit"

RDEPENDS:${PN} += "python-abi \
python311-Django"

inherit rpm
