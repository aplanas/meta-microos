SUMMARY = "Python library to return the first true value of an iterable"
DESCRIPTION = "A Python library that returns the first true value of an iterable."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python310-first-2.0.2-4.5.noarch.rpm"
RPM_HASH = "2fd310a7ff2afca9f06e4366541c3368c10c1e1575b8bfeb6ffcee7017f08c84cb4d93e81cf89c2ed24446b997ddb53cb9ef4fae26a191cc7e9cf63921584fca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-first \
python310-first \
python3dist-first"

RDEPENDS:${PN} += "python-abi"

inherit rpm
