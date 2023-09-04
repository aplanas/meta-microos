SUMMARY = "SocketIO integration for Flask applications"
DESCRIPTION = "Socket.IO integration for Flask applications."
LICENSE = "MIT"

PV = "5.3.5"

RPM_NAME = "python39-Flask-SocketIO-5.3.5-1.1.noarch.rpm"
RPM_HASH = "a5555e4b1777a4cea85ef95301a0bc041b3ddabdfc2dbf09d5083faa165d20e6f7211cb5ee8bcefebcde3b570e139656534a985e322ce64d9337cf6b934d01db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-flask-socketio \
python39-Flask-SocketIO \
python3dist-flask-socketio"

RDEPENDS:${PN} += "python-abi \
python39-Flask \
python39-python-socketio"

inherit rpm
