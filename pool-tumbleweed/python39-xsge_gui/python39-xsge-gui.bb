SUMMARY = "xSGE GUI Toolkit"
DESCRIPTION = "xSGE is a collection of extensions for SGE. \
xSGE extensions are not dependent on any particular SGE implementation. \
They should work with any implementation that follows the specification. \
 \
This extension provides a toolkit for adding GUIs to a SGE game \
as well as support for modal dialog boxes."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.1"

RPM_NAME = "python39-xsge_gui-1.2.1-2.7.noarch.rpm"
RPM_HASH = "6adb8856601d25a12c0b1616148696e413077f67953a41bd138231bce19dda78e436906d0771e09b6738b2338eaab3c4bd2182caaab926010ff868c8fb3ad238"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-xsge-gui \
python39-xsge-gui \
python3dist-xsge-gui"

RDEPENDS:${PN} += "python-abi \
python39-sge-pygame \
python39-six"

inherit rpm
