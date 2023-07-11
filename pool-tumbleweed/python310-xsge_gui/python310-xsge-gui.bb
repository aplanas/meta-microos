SUMMARY = "xSGE GUI Toolkit"
DESCRIPTION = "xSGE is a collection of extensions for SGE. \
xSGE extensions are not dependent on any particular SGE implementation. \
They should work with any implementation that follows the specification. \
 \
This extension provides a toolkit for adding GUIs to a SGE game \
as well as support for modal dialog boxes."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.1"

RPM_NAME = "python310-xsge_gui-1.2.1-2.8.noarch.rpm"
RPM_HASH = "417c56db2d95075a41b3c8130a43028b877872335bf3ba60820b624a7dc58dc3f6ae07d95f45821287c6ed7a777583646c73415e8d3b60ea1ee8ccfb4f55bca1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-xsge-gui \
python310-xsge-gui \
python3dist-xsge-gui"

RDEPENDS:${PN} += "python-abi \
python310-sge-pygame \
python310-six"

inherit rpm
