SUMMARY = "SocketIO integration for Flask applications"
DESCRIPTION = "Socket.IO integration for Flask applications."
LICENSE = "MIT"

PV = "5.3.4"

RPM_NAME = "python311-Flask-SocketIO-5.3.4-1.1.noarch.rpm"
RPM_HASH = "39b92b9f37415ffc78383212e4211bd848a5bf074075f059041d1b1577f4ea4efed3b7325c9403d0026ff822905ce2a1f0ea15996dc1811541a2fa1bd0317da9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-SocketIO \
python3.11dist-flask-socketio \
python311-Flask-SocketIO \
python3dist-flask-socketio"

RDEPENDS:${PN} += "python-abi \
python311-Flask \
python311-python-socketio"

inherit rpm
