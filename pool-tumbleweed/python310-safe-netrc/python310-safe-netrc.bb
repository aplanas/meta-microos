SUMMARY = "Safe netrc file parser"
DESCRIPTION = "This package provides a subclass of the Python standard library netrc.netrc \
class to add some custom behaviors."
LICENSE = "GPL-2.0+"

PV = "1.0.0"

RPM_NAME = "python310-safe-netrc-1.0.0-1.6.noarch.rpm"
RPM_HASH = "4334a87229983da60231b54e72f391e6a600b4c40fd43934db3c0e6f2afff5446d9b2c5d4f74e3422c5cb0f3b7ebd724eab8eba8265082d4da93d283053d23f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-safe-netrc \
python310-safe-netrc \
python3dist-safe-netrc"

RDEPENDS:${PN} += "python-abi"

inherit rpm
