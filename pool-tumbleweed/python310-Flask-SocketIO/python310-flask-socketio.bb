SUMMARY = "SocketIO integration for Flask applications"
DESCRIPTION = "Socket.IO integration for Flask applications."
LICENSE = "MIT"

PV = "5.3.4"

RPM_NAME = "python310-Flask-SocketIO-5.3.4-1.1.noarch.rpm"
RPM_HASH = "71dadda72c0e756393dedfb5fb408ba995ccdea42475a0ca32727a123d7eade9ae07642eace4ae042e963ecc9f887c9deef2152f4dd59b6259a2af5f031bfca4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-flask-socketio \
python310-Flask-SocketIO \
python3dist-flask-socketio"

RDEPENDS:${PN} += "python-abi \
python310-Flask \
python310-python-socketio"

inherit rpm
