SUMMARY = "A reusable Django field to store validated JSON"
DESCRIPTION = "Django-jsonfield is a reusable Django field that allows you to \
store validated JSON in your model."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python39-django-jsonfield-3.1.0-3.6.noarch.rpm"
RPM_HASH = "b19aa5947ecea2f857b7c99628de986341e02e0a617cfc70090bbaf2264accc10a8e0ddd2ee6116339dbfb23da506ac4ea5c5a306906f40b9936498237568c50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jsonfield) \
python39-django-jsonfield \
python3dist(jsonfield)"

RDEPENDS:${PN} += "python(abi) \
python39-Django"

inherit rpm
