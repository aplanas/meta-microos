SUMMARY = "A reusable Django field to store validated JSON"
DESCRIPTION = "Django-jsonfield is a reusable Django field that allows you to \
store validated JSON in your model."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python311-django-jsonfield-3.1.0-3.8.noarch.rpm"
RPM_HASH = "68d191f49c758ae1517575a94efb51255e1363568dce2b87e5af979a52896d25d964b89ea159e83c4e0dae1127ddf01a36c6548eb5c68ca5a5ba8bd1ded87327"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-jsonfield \
python3.11dist-jsonfield \
python311-django-jsonfield \
python3dist-jsonfield"

RDEPENDS:${PN} += "python-abi \
python311-Django"

inherit rpm
