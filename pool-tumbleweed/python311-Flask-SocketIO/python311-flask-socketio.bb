SUMMARY = "SocketIO integration for Flask applications"
DESCRIPTION = "Socket.IO integration for Flask applications."
LICENSE = "MIT"

PV = "5.3.5"

RPM_NAME = "python311-Flask-SocketIO-5.3.5-1.1.noarch.rpm"
RPM_HASH = "54228fffb204b89120ea1ddbcc466ea80efd676847750b0d0fd013974437c492de5ff3e09175c6644fa4b930fbea950576859377337e4b16aa660248bfc3a421"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-SocketIO \
python3.11dist-flask-socketio \
python311-Flask-SocketIO \
python3dist-flask-socketio"

RDEPENDS:${PN} += "python-abi \
python311-Flask \
python311-python-socketio"

inherit rpm
