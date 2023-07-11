SUMMARY = "Python socket mock framework"
DESCRIPTION = "Socket Mock Framework - for all kinds of socket animals, web-clients \
included, with gevent/asyncio/SSL support."
LICENSE = "BSD-3-Clause"

PV = "3.11.1"

RPM_NAME = "python310-mocket-3.11.1-1.2.noarch.rpm"
RPM_HASH = "a0636beb5acaf2ed3f214660c8f1e7f1a9c91ddc18a29debd3f8eadd708bc73dcf23deea3ff845967ceb22ff4fa3cb3584b74ea0674d4d6daf0ee60a27c0226b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-mocket \
python310-mocket \
python3dist-mocket"

RDEPENDS:${PN} += "python-abi \
python310-decorator \
python310-httptools \
python310-python-magic \
python310-urllib3"

inherit rpm
