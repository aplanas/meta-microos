SUMMARY = "WSGI request and response object - Documentation"
DESCRIPTION = "This package contains documentation files for python-WebOb."
LICENSE = "MIT"

PV = "1.8.7"

RPM_NAME = "python-WebOb-doc-1.8.7-6.3.noarch.rpm"
RPM_HASH = "cb3b42919982c65c44a803bb86d9ec5cc41355e915229b9d546120603ea71b36e78883ab7ea7bf0af5307d96dea94cf0ff1e5b3f1fc42e2b5deeec12ceadef03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-WebOb-doc \
python310-WebOb-doc \
python311-WebOb-doc \
python39-WebOb-doc"

RDEPENDS:${PN} += ""

inherit rpm
