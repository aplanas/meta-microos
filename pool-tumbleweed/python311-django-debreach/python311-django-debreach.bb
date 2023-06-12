SUMMARY = "Middleware to protect against the BREACH attack in Django"
DESCRIPTION = "Adds middleware and context processors to give some protection against the BREACH attack in Django."
LICENSE = "BSD-2-Clause"

PV = "2.1.0"

RPM_NAME = "python311-django-debreach-2.1.0-1.13.noarch.rpm"
RPM_HASH = "3b6fd6ac68a692c4706ddbf1e920aa08f30648e123f9d9df14fce82a746789863ed44702bca089c61dc8d0b30e4c436df62c43430c00738bbee5ae04d7a74675"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(django-debreach) \
python311-django-debreach \
python3dist(django-debreach)"
RDEPENDS:${PN} += "python(abi) \
python311-Django"

inherit rpm
