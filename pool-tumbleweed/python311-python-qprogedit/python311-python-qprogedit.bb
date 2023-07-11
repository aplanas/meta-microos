SUMMARY = "A QScintilla-based text-editor component"
DESCRIPTION = "QProgEdit is a PyQt widget that implements a text editor \
component. Its primary target at the moment is OpenSesame, a graphical \
experiment builder."
LICENSE = "GPL-3.0-or-later"

PV = "4.1.2"

RPM_NAME = "python311-python-qprogedit-4.1.2-2.21.noarch.rpm"
RPM_HASH = "6aa0b5ef79637b6cd0444325b3af6fbc6822b059460918b3934f59b88eaaf02ef71225eb122b0899598cec18f3681a5bbeada3a30b2f078c82b4d5fadcc9f01d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-qprogedit \
python3.11dist-python-qprogedit \
python311-python-qprogedit \
python3dist-python-qprogedit"

RDEPENDS:${PN} += "python-abi \
python311-QtPy \
python311-qscintilla-qt5"

inherit rpm
