SUMMARY = "WSGI request and response object - Documentation"
DESCRIPTION = "This package contains documentation files for python-WebOb."
LICENSE = "MIT"

PV = "1.8.7"

RPM_NAME = "python-WebOb-doc-1.8.7-6.1.noarch.rpm"
RPM_HASH = "007f09c27ebd9211004600589dd8be2afce29da841eb253f587b4c5d741f7664700699ce02f4b59f10b4dd4c28ca2762ccad170911a5271fc1f8078d438ffa81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-WebOb-doc \
python310-WebOb-doc \
python311-WebOb-doc \
python39-WebOb-doc"

RDEPENDS:${PN} += ""

inherit rpm
