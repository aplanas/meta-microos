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

RPM_NAME = "python310-eventlet-0.33.3-4.1.noarch.rpm"
RPM_HASH = "0dfc661d2e0b74c5ab2e2fb634a3796403ea8d9192f65a6fb66b59a94d297785c41793ec5bc0809a6643e32c9d9855d3e22f4290925c4504bedcf8a081d43f24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-eventlet \
python3.10dist-eventlet \
python310-eventlet \
python3dist-eventlet"

RDEPENDS:${PN} += "libnss-usrfiles2 \
netcfg \
python-abi \
python310-dnspython \
python310-greenlet \
python310-six"

inherit rpm
