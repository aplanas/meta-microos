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

RPM_NAME = "python311-eventlet-0.33.3-4.1.noarch.rpm"
RPM_HASH = "0d75939a5ce3977d5c71cec1b9162fc9e6c3ef38dfefdca10fa00699e8472ac9cee35933bbcdf10c71dbd8d75d5ddaf9306b57d3b92954a228bf1fd214a237c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-eventlet \
python311-eventlet \
python3dist-eventlet"

RDEPENDS:${PN} += "libnss-usrfiles2 \
netcfg \
python-abi \
python311-dnspython \
python311-greenlet \
python311-six"

inherit rpm
