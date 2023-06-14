SUMMARY = "SocketIO server"
DESCRIPTION = "Python implementation of the Socket.IO realtime server."
LICENSE = "MIT"

PV = "5.7.2"

RPM_NAME = "python311-python-socketio-5.7.2-1.3.noarch.rpm"
RPM_HASH = "275754feff79d41eb9c2477801b930c82b335bd84e12a14fc80ac575572c0cdff7fce59ff9296e2214713705a051819c936e5ea462ae6f8469b34f679861dc11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-python-socketio \
python311-python-socketio \
python3dist-python-socketio"

RDEPENDS:${PN} += "python-abi \
python311-bidict \
python311-python-engineio"

inherit rpm
