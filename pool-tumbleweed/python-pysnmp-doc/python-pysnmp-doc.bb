SUMMARY = "PySNMP documentation"
DESCRIPTION = "PySNMP documentation and examples."
LICENSE = "BSD-2-Clause"

PV = "4.4.12"

RPM_NAME = "python-pysnmp-doc-4.4.12-2.15.noarch.rpm"
RPM_HASH = "7ebe9626a5331cbcc2d396f159795f290a73f1f20d0ba047525e76fd37d842f8b61ac5681e5505a713c806f67666037a15c4a81590f3c7dd0f889a5b33157879"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-pysnmp-doc \
python310-pysnmp-doc \
python311-pysnmp-doc \
python39-pysnmp-doc"

RDEPENDS:${PN} += ""

inherit rpm
