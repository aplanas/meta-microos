SUMMARY = "SocketIO server"
DESCRIPTION = "Python implementation of the Socket.IO realtime server."
LICENSE = "MIT"

PV = "5.7.2"

RPM_NAME = "python39-python-socketio-5.7.2-1.3.noarch.rpm"
RPM_HASH = "58dcbac9bcbec63975daa46f3639be88c7c3f8f354af0338ba2da57767d0560079b9c1026cc33dc2785315c93a19cd1482612c47b027511e653d04da27ede71a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-socketio \
python39-python-socketio \
python3dist-python-socketio"

RDEPENDS:${PN} += "python-abi \
python39-bidict \
python39-python-engineio"

inherit rpm
