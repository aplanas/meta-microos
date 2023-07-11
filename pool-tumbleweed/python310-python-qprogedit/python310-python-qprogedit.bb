SUMMARY = "A QScintilla-based text-editor component"
DESCRIPTION = "QProgEdit is a PyQt widget that implements a text editor \
component. Its primary target at the moment is OpenSesame, a graphical \
experiment builder."
LICENSE = "GPL-3.0-or-later"

PV = "4.1.2"

RPM_NAME = "python310-python-qprogedit-4.1.2-2.21.noarch.rpm"
RPM_HASH = "d9cdecf679c8cd935e9b4b295e085de422e3a7448539890e42177a548106d7507b5e5297c9c210f4c4055093ea06e9722b590f6dd020da3e0abda48e19b963be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-qprogedit \
python310-python-qprogedit \
python3dist-python-qprogedit"

RDEPENDS:${PN} += "python-abi \
python310-QtPy \
python310-qscintilla-qt5"

inherit rpm
