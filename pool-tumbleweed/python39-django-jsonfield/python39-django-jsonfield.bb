SUMMARY = "A reusable Django field to store validated JSON"
DESCRIPTION = "Django-jsonfield is a reusable Django field that allows you to \
store validated JSON in your model."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python39-django-jsonfield-3.1.0-3.8.noarch.rpm"
RPM_HASH = "8abfb9dc49e881ec96e0f3363be4fab831c3e1936632a6529ec5f39f45fa8368f11276a2036c7235f49e67f116277907902bca7229b563c47899d500c2a17fd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jsonfield \
python39-django-jsonfield \
python3dist-jsonfield"

RDEPENDS:${PN} += "python-abi \
python39-Django"

inherit rpm
