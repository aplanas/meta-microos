SUMMARY = "xSGE GUI Toolkit"
DESCRIPTION = "xSGE is a collection of extensions for SGE. \
xSGE extensions are not dependent on any particular SGE implementation. \
They should work with any implementation that follows the specification. \
 \
This extension provides a toolkit for adding GUIs to a SGE game \
as well as support for modal dialog boxes."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.1"

RPM_NAME = "python311-xsge_gui-1.2.1-2.8.noarch.rpm"
RPM_HASH = "9672e8a6c66ba4931844ba49f0f1e1499dbcd36e1248fd8d5f286a8234863babdf3f39b63166a05b5e1e3dbe0ce947e742c0bfdbdedadeea5e4ec14242e97dd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xsge-gui \
python3.11dist-xsge-gui \
python311-xsge-gui \
python3dist-xsge-gui"

RDEPENDS:${PN} += "python-abi \
python311-sge-pygame \
python311-six"

inherit rpm
