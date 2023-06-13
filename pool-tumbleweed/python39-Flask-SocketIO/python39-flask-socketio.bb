SUMMARY = "SocketIO integration for Flask applications"
DESCRIPTION = "Socket.IO integration for Flask applications."
LICENSE = "MIT"

PV = "5.1.1"

RPM_NAME = "python39-Flask-SocketIO-5.1.1-1.8.noarch.rpm"
RPM_HASH = "2151dabe1c161a752af80d823374393a797ff65eb3dedb5f02fbf650a69b39b826c585696edbd1d3b11910e40ee2139364ae6d63b9e383564f60dc660d4b3b1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(flask-socketio) \
python39-Flask-SocketIO \
python3dist(flask-socketio)"

RDEPENDS:${PN} += "python(abi) \
python39-Flask \
python39-python-socketio"

inherit rpm
