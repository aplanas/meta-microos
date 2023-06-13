SUMMARY = "xSGE GUI Toolkit"
DESCRIPTION = "xSGE is a collection of extensions for SGE. \
xSGE extensions are not dependent on any particular SGE implementation. \
They should work with any implementation that follows the specification. \
 \
This extension provides a toolkit for adding GUIs to a SGE game \
as well as support for modal dialog boxes."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.1"

RPM_NAME = "python311-xsge_gui-1.2.1-2.7.noarch.rpm"
RPM_HASH = "af3e79702ba748461198a87072a435870b212693a05e6ccd6b3f4e1fcb6f1950a509e33ceac1aa774e3bd5061562f2c4b4a09b33ad5b5c114ded43739f1cfcf2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(xsge-gui) \
python311-xsge_gui \
python3dist(xsge-gui)"

RDEPENDS:${PN} += "python(abi) \
python311-sge-pygame \
python311-six"

inherit rpm
