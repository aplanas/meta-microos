SUMMARY = "Development files for python310-qtnetworkauth-qt5"
DESCRIPTION = "This package provides Qt5 Network Authorization library API files \
and the SIP files used to generate the Python bindings for python310-qtnetworkauth-qt5."
LICENSE = "GPL-3.0-only"

PV = "5.15.5"

RPM_NAME = "python310-qtnetworkauth-qt5-devel-5.15.5-1.15.aarch64.rpm"
RPM_HASH = "1e06a9afa07d737b6300f253bdfa03928fbebf73030c7c08310e6229ac832f05de6e267ab1bd91fd773048cc0d4bf34d990f4fe41814ef58555f7ca63c535db4"

RPROVIDES:${PN} += "python310-qtnetworkauth-qt5-devel"

RDEPENDS:${PN} += "python-abi \
python310-qt5-devel \
python310-qtnetworkauth-qt5"

inherit rpm
