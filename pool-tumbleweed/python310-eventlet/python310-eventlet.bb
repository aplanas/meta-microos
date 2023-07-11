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

RPM_NAME = "python310-eventlet-0.33.3-5.1.noarch.rpm"
RPM_HASH = "24345eccb6183123177d626a8b0d96e268c40c0f0a3c53470c671e41d63b70845943484481da7f81e9cfc3ad7f9f1be02a91b7af536faad4563687ba165a72f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-eventlet \
python310-eventlet \
python3dist-eventlet"

RDEPENDS:${PN} += "libnss-usrfiles2 \
netcfg \
python-abi \
python310-dnspython \
python310-greenlet \
python310-six"

inherit rpm
