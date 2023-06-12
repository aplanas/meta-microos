SUMMARY = "Base Widget for Orange Canvas"
DESCRIPTION = "Base Widget for Orange Canvas"
LICENSE = "GPL-3.0-or-later"

PV = "4.11.0"

RPM_NAME = "python39-orange-widget-base-4.11.0-1.8.noarch.rpm"
RPM_HASH = "af5436d54faa68e3811619f627fe0544bf686cd29177702e0ae68e709ccd344dbfad45d19117b824907ba1ccb3e99b2d3586e114f1c43d2ea7396ab80a78c5f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(orange-widget-base) \
python39-orange-widget-base \
python3dist(orange-widget-base)"
RDEPENDS:${PN} += "python(abi) \
python39-AnyQt \
python39-matplotlib \
python39-orange-canvas-core \
python39-pyqtgraph \
python39-qt5 \
python39-qtwebengine-qt5"

inherit rpm
