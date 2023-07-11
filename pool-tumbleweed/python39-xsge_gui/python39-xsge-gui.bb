SUMMARY = "xSGE GUI Toolkit"
DESCRIPTION = "xSGE is a collection of extensions for SGE. \
xSGE extensions are not dependent on any particular SGE implementation. \
They should work with any implementation that follows the specification. \
 \
This extension provides a toolkit for adding GUIs to a SGE game \
as well as support for modal dialog boxes."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.1"

RPM_NAME = "python39-xsge_gui-1.2.1-2.8.noarch.rpm"
RPM_HASH = "787bc2d1a1adea92b7836e474026bd310bc3e6fedcce5bce404b321db924cc29ba8fa284536006b0499c36ec3c71cbb7483ab55a98518e8b073501434e4eb837"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-xsge-gui \
python39-xsge-gui \
python3dist-xsge-gui"

RDEPENDS:${PN} += "python-abi \
python39-sge-pygame \
python39-six"

inherit rpm
