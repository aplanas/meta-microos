SUMMARY = "Python socket mock framework"
DESCRIPTION = "Socket Mock Framework - for all kinds of socket animals, web-clients \
included, with gevent/asyncio/SSL support."
LICENSE = "BSD-3-Clause"

PV = "3.11.1"

RPM_NAME = "python39-mocket-3.11.1-1.1.noarch.rpm"
RPM_HASH = "2a0c501778633d1d109ab4750e6a15208b269ef3e051cb823a35c6e22583f2c5de80098fe79e580185514087103f2f3c38f5935316dc0c06efd1a8e06ff059ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(mocket) \
python39-mocket \
python3dist(mocket)"
RDEPENDS:${PN} += "python(abi) \
python39-decorator \
python39-httptools \
python39-python-magic \
python39-urllib3"

inherit rpm
