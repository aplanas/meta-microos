SUMMARY = "Base Widget for Orange Canvas"
DESCRIPTION = "Base Widget for Orange Canvas"
LICENSE = "GPL-3.0-or-later"

PV = "4.11.0"

RPM_NAME = "python39-orange-widget-base-4.11.0-1.9.noarch.rpm"
RPM_HASH = "92bc61218234aa9b6827f5fdefc4f78b35747116f2fc692de280c742047ee79f624875ef15698ba3519bde91dca36bf046eda466e42e6aaa64c88a3d509dd51b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-orange-widget-base \
python39-orange-widget-base \
python3dist-orange-widget-base"

RDEPENDS:${PN} += "python-abi \
python39-AnyQt \
python39-matplotlib \
python39-orange-canvas-core \
python39-pyqtgraph \
python39-qt5 \
python39-qtwebengine-qt5"

inherit rpm
