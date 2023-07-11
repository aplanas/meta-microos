SUMMARY = "Development files for python311-qtnetworkauth-qt5"
DESCRIPTION = "This package provides Qt5 Network Authorization library API files \
and the SIP files used to generate the Python bindings for python311-qtnetworkauth-qt5."
LICENSE = "GPL-3.0-only"

PV = "5.15.5"

RPM_NAME = "python311-qtnetworkauth-qt5-devel-5.15.5-1.15.aarch64.rpm"
RPM_HASH = "5092891cd0ad9fcb7b9f3029998583c36ffe95d197dcd95e4a0147ed83f096c13c1641ca832313b17d67313d93ba88bb2dfd3661b7c4d0bf606984237dbc7ee4"

RPROVIDES:${PN} += "python3-qtnetworkauth-qt5-devel \
python311-qtnetworkauth-qt5-devel"

RDEPENDS:${PN} += "python-abi \
python311-qt5-devel \
python311-qtnetworkauth-qt5"

inherit rpm
