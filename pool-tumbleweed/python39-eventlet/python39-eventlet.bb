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

RPM_NAME = "python39-eventlet-0.33.3-4.1.noarch.rpm"
RPM_HASH = "840854f482e8f405da71a7e195b06202cfef054eb0068e4c77123d00adbe5f2b528ad11d50b71d35343b8e7aed951e27455cfb64d77e116358f02ae6924f65af"
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
