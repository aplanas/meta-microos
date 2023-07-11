SUMMARY = "Base Widget for Orange Canvas"
DESCRIPTION = "Base Widget for Orange Canvas"
LICENSE = "GPL-3.0-or-later"

PV = "4.11.0"

RPM_NAME = "python311-orange-widget-base-4.11.0-1.9.noarch.rpm"
RPM_HASH = "80ad78ebcff64d7002d08a56b78b084640ee03b52cfd2fb47d62d01f830f26414ceb722defc78ef3334542e2db3ebfe1eb3f26150cbffda4f42bf72b69c5f2df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-orange-widget-base \
python3.11dist-orange-widget-base \
python311-orange-widget-base \
python3dist-orange-widget-base"

RDEPENDS:${PN} += "python-abi \
python311-AnyQt \
python311-matplotlib \
python311-orange-canvas-core \
python311-pyqtgraph \
python311-qt5 \
python311-qtwebengine-qt5"

inherit rpm
