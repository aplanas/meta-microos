SUMMARY = "Extensions to the Python Standard Library Unit Testing Framework"
DESCRIPTION = "testtools is a set of extensions to the Python standard library's unit tests \
framework. These extensions have been derived from many years of experience \
with unit tests in Python and come from many different sources. testtools \
also ports recent unittest changes all the way back to Python 2.4."
LICENSE = "MIT"

PV = "2.6.0"

RPM_NAME = "python310-testtools-2.6.0-1.3.noarch.rpm"
RPM_HASH = "65a3c33161a705a1d3087b803f4ade10ab500a33e00277a2e75bac18f45d5d1a56a22c74b2da6dc22cbbbb5bd64c51c3688baf5687f657d64fbb1e996f61f6c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-testtools \
python310-testtools \
python3dist-testtools"

RDEPENDS:${PN} += "python-abi \
python310-pbr \
python310-python-mimeparse \
python310-traceback2"

inherit rpm
