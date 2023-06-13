SUMMARY = "A QScintilla-based text-editor component"
DESCRIPTION = "QProgEdit is a PyQt widget that implements a text editor \
component. Its primary target at the moment is OpenSesame, a graphical \
experiment builder."
LICENSE = "GPL-3.0-or-later"

PV = "4.1.2"

RPM_NAME = "python310-python-qprogedit-4.1.2-2.19.noarch.rpm"
RPM_HASH = "0e1259bbf20c560fa0fba0d86a3e9068bf51bf39a94a09d9f27dec027c61361b5446da1bd19f49be4fa7c8ee12af78122fdbf8cfdc60439d60429681ba300bfa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-qprogedit \
python3.10dist(python-qprogedit) \
python310-python-qprogedit \
python3dist(python-qprogedit)"

RDEPENDS:${PN} += "python(abi) \
python310-QtPy \
python310-qscintilla-qt5"

inherit rpm
