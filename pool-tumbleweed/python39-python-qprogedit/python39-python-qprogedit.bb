SUMMARY = "A QScintilla-based text-editor component"
DESCRIPTION = "QProgEdit is a PyQt widget that implements a text editor \
component. Its primary target at the moment is OpenSesame, a graphical \
experiment builder."
LICENSE = "GPL-3.0-or-later"

PV = "4.1.2"

RPM_NAME = "python39-python-qprogedit-4.1.2-2.21.noarch.rpm"
RPM_HASH = "8b9748577a0b53f7ba8456d433c7b8e6de74b5e30ceb24f978cc3daceecc4520e46f8ed6b80e32f3036d192717a3e8d1c781921614f863786f341d320b46a25c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-qprogedit \
python39-python-qprogedit \
python3dist-python-qprogedit"

RDEPENDS:${PN} += "python-abi \
python39-QtPy \
python39-qscintilla-qt5"

inherit rpm
