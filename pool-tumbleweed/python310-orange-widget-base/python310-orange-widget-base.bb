SUMMARY = "Base Widget for Orange Canvas"
DESCRIPTION = "Base Widget for Orange Canvas"
LICENSE = "GPL-3.0-or-later"

PV = "4.11.0"

RPM_NAME = "python310-orange-widget-base-4.11.0-1.9.noarch.rpm"
RPM_HASH = "bbecc65cf43865c71faa27bafcb7cb1ce5463c5d27454bd48d8646edf9bae7a0ae7021814ad891cdfa8389027dc347a84a400cef2d0567836ece90ab56063450"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-orange-widget-base \
python310-orange-widget-base \
python3dist-orange-widget-base"

RDEPENDS:${PN} += "python-abi \
python310-AnyQt \
python310-matplotlib \
python310-orange-canvas-core \
python310-pyqtgraph \
python310-qt5 \
python310-qtwebengine-qt5"

inherit rpm
