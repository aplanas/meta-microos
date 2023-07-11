SUMMARY = "A Django middleware that logs tracebacks of slow requests"
DESCRIPTION = "A Django middleware that logs tracebacks of slow requests and allows further inspection."
LICENSE = "LGPL-2.1-only"

PV = "1.2"

RPM_NAME = "python310-dogslow-1.2-1.16.noarch.rpm"
RPM_HASH = "ab35101969092c5c099c7503ab6bd786dec901553c0a0fc854c931ccf48cae78c8c245fecaf35a284c0cde85b4d78f5185973bbba557001675a8c071f3d0e56b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-dogslow \
python310-dogslow \
python3dist-dogslow"

RDEPENDS:${PN} += "python-abi"

inherit rpm
