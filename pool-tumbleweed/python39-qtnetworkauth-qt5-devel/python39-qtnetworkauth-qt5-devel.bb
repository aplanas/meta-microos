SUMMARY = "Development files for python39-qtnetworkauth-qt5"
DESCRIPTION = "This package provides Qt5 Network Authorization library API files \
and the SIP files used to generate the Python bindings for python39-qtnetworkauth-qt5."
LICENSE = "GPL-3.0-only"

PV = "5.15.5"

RPM_NAME = "python39-qtnetworkauth-qt5-devel-5.15.5-1.15.aarch64.rpm"
RPM_HASH = "61501b11c5bc984baf4f1dd57b3383926000f7995868f25bad46b086b3100503d9563490a4f5dfd02398e9f244b34c34703eb8217f482deaf0448d237c33a203"

RPROVIDES:${PN} += "python39-qtnetworkauth-qt5-devel"

RDEPENDS:${PN} += "python-abi \
python39-qt5-devel \
python39-qtnetworkauth-qt5"

inherit rpm
