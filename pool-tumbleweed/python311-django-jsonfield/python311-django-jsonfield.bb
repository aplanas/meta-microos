SUMMARY = "A reusable Django field to store validated JSON"
DESCRIPTION = "Django-jsonfield is a reusable Django field that allows you to \
store validated JSON in your model."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python311-django-jsonfield-3.1.0-3.6.noarch.rpm"
RPM_HASH = "39a661a950c90d1d2c30b4fa14b9a9a2a19fee6b98470a9b9314c1efbd201789683c3536405fd2ac8fe29f4fc6a9ba402de1c80d009eea1edc34489c045aad51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-jsonfield \
python311-django-jsonfield \
python3dist-jsonfield"

RDEPENDS:${PN} += "python-abi \
python311-Django"

inherit rpm
