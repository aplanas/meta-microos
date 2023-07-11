SUMMARY = "Python bindings for VIPS image processing library"
DESCRIPTION = "This package contains the Python bindings for the VIPS library."
LICENSE = "MIT"

PV = "2.2.1"

RPM_NAME = "python39-pyvips-2.2.1-1.5.noarch.rpm"
RPM_HASH = "8bdd06a38e761ea4cf832f946bf213327a6d99a90e8abed55adc411c58327ca53c251cf9bc8d51946c2d952598d65d70cd1677b93489c46bc95651b6b4426a04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyvips \
python39-pyvips \
python3dist-pyvips"

RDEPENDS:${PN} += "python-abi \
python39-cffi"

inherit rpm
