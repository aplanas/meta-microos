SUMMARY = "SocketIO integration for Flask applications"
DESCRIPTION = "Socket.IO integration for Flask applications."
LICENSE = "MIT"

PV = "5.1.1"

RPM_NAME = "python310-Flask-SocketIO-5.1.1-1.8.noarch.rpm"
RPM_HASH = "7d275bf2c9318ba6d9c4351caf3b0fce18cb8cabdb33eacae65023a9809636c15241132dc0fd0a7485e8a7ada9d9bfc44e7642f3bcdcb3508fb5c417961c1339"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-SocketIO \
python3.10dist-flask-socketio \
python310-Flask-SocketIO \
python3dist-flask-socketio"

RDEPENDS:${PN} += "python-abi \
python310-Flask \
python310-python-socketio"

inherit rpm
