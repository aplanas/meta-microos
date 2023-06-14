SUMMARY = "Bootstrap support for Django projects"
DESCRIPTION = "Bootstrap support for Django projects."
LICENSE = "BSD-3-Clause"

PV = "21.2"

RPM_NAME = "python39-django-bootstrap4-21.2-1.11.noarch.rpm"
RPM_HASH = "8c3154f34a6746ef96d4835e1d63d241351fbd218bba305a4a66871ab3e7b2699982665ff135577b48135ba40c3ef55744ccf1347c33f26753d55dac37a6c643"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-bootstrap4 \
python39-django-bootstrap4 \
python3dist-django-bootstrap4"

RDEPENDS:${PN} += "python-abi \
python39-Django \
python39-beautifulsoup4"

inherit rpm
