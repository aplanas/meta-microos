SUMMARY = "Bootstrap support for Django projects"
DESCRIPTION = "Bootstrap support for Django projects."
LICENSE = "BSD-3-Clause"

PV = "21.2"

RPM_NAME = "python310-django-bootstrap4-21.2-1.13.noarch.rpm"
RPM_HASH = "a7471b74e5f7d0967790d2d8d97a6c77a9c0749713ffceb09db2848d5a73dbb047e93cda2decaa09841d1942881c20796b5b8750b3041c15957e17db0a50b4c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-bootstrap4 \
python310-django-bootstrap4 \
python3dist-django-bootstrap4"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-beautifulsoup4"

inherit rpm
