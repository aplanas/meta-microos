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

RPM_NAME = "python39-eventlet-0.33.3-5.1.noarch.rpm"
RPM_HASH = "67c0b90207d4dea96ab43cdbe7cc94d6e7ae431ba9ee632482f7192269cc09b7da3634a759a883e1e1957a12937c9e6506dae21cb2267c5b77bc8420ac1b7385"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-eventlet \
python39-eventlet \
python3dist-eventlet"

RDEPENDS:${PN} += "libnss-usrfiles2 \
netcfg \
python-abi \
python39-dnspython \
python39-greenlet \
python39-six"

inherit rpm
