SUMMARY = "The Python 'ana' module"
DESCRIPTION = "A Python module that provides an undocumented data layer for Python objects."
LICENSE = "BSD-2-Clause"

PV = "0.06"

RPM_NAME = "python310-ana-0.06-4.1.noarch.rpm"
RPM_HASH = "5caa50fbae8c02ee12601e8819d6c9b55d6f310106434f0d392c01a8f3aca92c006099b7ac3b3ac94b49a93b3c5de2bc79bce6cd220760b67c6c7961d3816f4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ana \
python310-ana \
python3dist-ana"

RDEPENDS:${PN} += "python-abi"

inherit rpm
