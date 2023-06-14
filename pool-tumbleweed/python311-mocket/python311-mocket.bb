SUMMARY = "Python socket mock framework"
DESCRIPTION = "Socket Mock Framework - for all kinds of socket animals, web-clients \
included, with gevent/asyncio/SSL support."
LICENSE = "BSD-3-Clause"

PV = "3.11.1"

RPM_NAME = "python311-mocket-3.11.1-1.1.noarch.rpm"
RPM_HASH = "dff78ce23eadcde683d49a40719e794fd0c40c0fe2ace4314c4666b37f90e2be9a7a3c72fe3c7a602d2e97dd45b9b2198fdb03b0de2e17fbeb9a750df2fe8775"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-mocket \
python311-mocket \
python3dist-mocket"

RDEPENDS:${PN} += "python-abi \
python311-decorator \
python311-httptools \
python311-python-magic \
python311-urllib3"

inherit rpm
