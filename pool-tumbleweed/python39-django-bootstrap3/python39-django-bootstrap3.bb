SUMMARY = "Bootstrap support for Django projects"
DESCRIPTION = "Bootstrap support for Django projects."
LICENSE = "BSD-3-Clause"

PV = "14.2.0"

RPM_NAME = "python39-django-bootstrap3-14.2.0-2.8.noarch.rpm"
RPM_HASH = "0e49fa96b50b44b992aec30fa99f05644663fbec804e3c3fdce967ef2d05e3c1b84fd04963f896a2016984abdc47238f6522774d8b958215494edc27ff5a79f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-bootstrap3 \
python39-django-bootstrap3 \
python3dist-django-bootstrap3"

RDEPENDS:${PN} += "python-abi \
python39-Django"

inherit rpm
