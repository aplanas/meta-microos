SUMMARY = "SocketIO integration for Flask applications"
DESCRIPTION = "Socket.IO integration for Flask applications."
LICENSE = "MIT"

PV = "5.3.5"

RPM_NAME = "python310-Flask-SocketIO-5.3.5-1.1.noarch.rpm"
RPM_HASH = "cab1954efb07465a5d1369b030e8a74ae026dd477678596ab3575b066ad6978c4cfdbff2979557d3363f17e5a432d0913cd4426ff94b514d26aedd48bf8795ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flask-socketio \
python310-Flask-SocketIO \
python3dist-flask-socketio"

RDEPENDS:${PN} += "python-abi \
python310-Flask \
python310-python-socketio"

inherit rpm
