SUMMARY = "Extensions to the Python Standard Library Unit Testing Framework"
DESCRIPTION = "testtools is a set of extensions to the Python standard library's unit tests \
framework. These extensions have been derived from many years of experience \
with unit tests in Python and come from many different sources. testtools \
also ports recent unittest changes all the way back to Python 2.4."
LICENSE = "MIT"

PV = "2.6.0"

RPM_NAME = "python39-testtools-2.6.0-1.3.noarch.rpm"
RPM_HASH = "f287cab56758c7536f490d74fb504122385ad3fae378b9cb68bd70d4aaa031ca80e8886c8cf22bf9c4d501376b7f1a9d39670990804a45497198023a5d6ca9b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-testtools \
python39-testtools \
python3dist-testtools"

RDEPENDS:${PN} += "python-abi \
python39-pbr \
python39-python-mimeparse \
python39-traceback2"

inherit rpm
