SUMMARY = "SocketIO server"
DESCRIPTION = "Python implementation of the Socket.IO realtime server."
LICENSE = "MIT"

PV = "5.7.2"

RPM_NAME = "python310-python-socketio-5.7.2-1.5.noarch.rpm"
RPM_HASH = "dfa6ea5e4212c039dc71f093122c1575dbf3fd48bfddd23bbb22bdcd23a99653bedfc9440aa9631e99f4168791bb5feb1cbafe638c4fca7b153de03aa19f0d9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-socketio \
python310-python-socketio \
python3dist-python-socketio"

RDEPENDS:${PN} += "python-abi \
python310-bidict \
python310-python-engineio"

inherit rpm
