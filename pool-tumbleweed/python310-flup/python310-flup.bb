SUMMARY = "Random assortment of WSGI servers"
DESCRIPTION = "A random collection of WSGI modules for Python"
LICENSE = "BSD-2-Clause"

PV = "1.0.3.dev20161029"

RPM_NAME = "python310-flup-1.0.3.dev20161029-3.2.noarch.rpm"
RPM_HASH = "4f4403d331d430bd08dc4033f9816e35339550a063612cbbc324f35ff78c645f26098b836fa4e6a4dadb87a9de313b2b0dc76e9f07d9df48ea8ee934091e9216"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flup \
python310-flup \
python3dist-flup"

RDEPENDS:${PN} += "python-abi"

inherit rpm
