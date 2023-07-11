SUMMARY = "Python socket pool"
DESCRIPTION = "Socket pool is a socket pool that supports multiple factories and \
backends. It can be used by gevent, eventlet or any other library."
LICENSE = "MIT"

PV = "0.5.3"

RPM_NAME = "python311-socketpool-0.5.3-9.12.noarch.rpm"
RPM_HASH = "b1ff27561dfdc2e5269b5c7f14c2b4e36e94ba29fedac73995c63988b360b3c333a69a17389428cbf463dde3930791b3d65a617b9e93e3b2006dcbe52d2141dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-socketpool \
python3.11dist-socketpool \
python311-socketpool \
python3dist-socketpool"

RDEPENDS:${PN} += "python-abi"

inherit rpm
