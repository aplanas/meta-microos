SUMMARY = "SocketIO server"
DESCRIPTION = "Python implementation of the Socket.IO realtime server."
LICENSE = "MIT"

PV = "5.7.2"

RPM_NAME = "python39-python-socketio-5.7.2-1.5.noarch.rpm"
RPM_HASH = "9f4fa0d5d3f7dafb7ce4c4c26f41149fc72d462322d958e30ad283385e578042a050ec41a2aeb145b88017848a6c30cdbc946b9eaca0cea9bcc5022292bc379b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-socketio \
python39-python-socketio \
python3dist-python-socketio"

RDEPENDS:${PN} += "python-abi \
python39-bidict \
python39-python-engineio"

inherit rpm
