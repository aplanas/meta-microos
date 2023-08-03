SUMMARY = "Python to JavaScript compiler"
DESCRIPTION = "PScript is a Python to JavaScript compiler, and is also the name of the subset \
of Python that this compiler supports."
LICENSE = "BSD-2-Clause"

PV = "0.7.7"

RPM_NAME = "python310-pscript-0.7.7-2.1.noarch.rpm"
RPM_HASH = "27b0531c82be937fe17ba2d83b308a6e13520c130b607e94dd1a9518700bce3c9cbbd936acae24f9f8ad996535702dea0a80343aa8658c5f966c53343d8e5c91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pscript \
python310-pscript \
python3dist-pscript"

RDEPENDS:${PN} += "python-abi"

inherit rpm
