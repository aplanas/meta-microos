SUMMARY = "Python library to return the first true value of an iterable"
DESCRIPTION = "A Python library that returns the first true value of an iterable."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python310-first-2.0.2-4.3.noarch.rpm"
RPM_HASH = "638b48fdeb69abfe6d59ea1c61630cbb5c419f37bad84f231593b89378fbf419670dc3ba7956de90418017024fec2b0e628b67ba322caec6fcb59f5c4cdf94e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-first \
python3.10dist-first \
python310-first \
python3dist-first"

RDEPENDS:${PN} += "python-abi"

inherit rpm
