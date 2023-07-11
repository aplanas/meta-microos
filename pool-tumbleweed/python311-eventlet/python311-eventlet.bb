SUMMARY = "Concurrent networking library for Python"
DESCRIPTION = "Eventlet is a concurrent networking library for Python that allows \
changing how code is run. \
 \
It uses epoll or libevent for scalable non-blocking I/O. Coroutines \
ensure that the developer uses a blocking style of programming that is similar \
to threading, but provide the benefits of non-blocking I/O. The event dispatch \
is implicit, which means Eventlet can be used from the Python \
interpreter, or as part of a larger application."
LICENSE = "MIT"

PV = "0.33.3"

RPM_NAME = "python311-eventlet-0.33.3-5.1.noarch.rpm"
RPM_HASH = "fa27427321eae8580df7deb0e24f98b871db6cf422140ddfb2358b84dab1ed1f008f2668b945b9cc179c2bf3b932aaa5b0f3c949012017ef9aef9afc8d26d1db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-eventlet \
python3.11dist-eventlet \
python311-eventlet \
python3dist-eventlet"

RDEPENDS:${PN} += "libnss-usrfiles2 \
netcfg \
python-abi \
python311-dnspython \
python311-greenlet \
python311-six"

inherit rpm
