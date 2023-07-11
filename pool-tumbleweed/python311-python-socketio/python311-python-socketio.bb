SUMMARY = "SocketIO server"
DESCRIPTION = "Python implementation of the Socket.IO realtime server."
LICENSE = "MIT"

PV = "5.7.2"

RPM_NAME = "python311-python-socketio-5.7.2-1.5.noarch.rpm"
RPM_HASH = "409273f255a2a8c1a06eeec23d2af993239057ebc42fa0d16e48f4a7cf423b8ec50024a342d5179d67198d384c38c560628c8ff58496891c23f51cdca70bb192"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-socketio \
python3.11dist-python-socketio \
python311-python-socketio \
python3dist-python-socketio"

RDEPENDS:${PN} += "python-abi \
python311-bidict \
python311-python-engineio"

inherit rpm
