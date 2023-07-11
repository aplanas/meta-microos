SUMMARY = "SocketIO integration for Flask applications"
DESCRIPTION = "Socket.IO integration for Flask applications."
LICENSE = "MIT"

PV = "5.3.4"

RPM_NAME = "python39-Flask-SocketIO-5.3.4-1.1.noarch.rpm"
RPM_HASH = "41c33932f33cb0631dafa8413137f0d60d2e618d02b52a45ec213c3aac765250c04f2d2a9fab80f1d3a7fada6a96766a8cde2ce20bd50421c68a4f893c01cbdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flask-socketio \
python39-Flask-SocketIO \
python3dist-flask-socketio"

RDEPENDS:${PN} += "python-abi \
python39-Flask \
python39-python-socketio"

inherit rpm
