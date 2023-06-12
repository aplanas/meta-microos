SUMMARY = "Data of deepin-control-center"
DESCRIPTION = "The deepin-control-center is the control panel of Deepin Desktop. \
 \
deepin-control-center-data is the data of deepin-control-center."
LICENSE = "LGPL-3.0-or-later"

PV = "5.5.143"

RPM_NAME = "deepin-control-center-data-5.5.143-1.7.noarch.rpm"
RPM_HASH = "c49d994496ef79fc859e30b9305b1198c093520ead07afb66f6dfe4559d08ba92fa9e1b332041e0b0752a8387bd1b08d3ac23372409a2f7eed44e5e57367a303"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-control-center-data"
RDEPENDS:${PN} += "deepin-control-center"

inherit rpm
