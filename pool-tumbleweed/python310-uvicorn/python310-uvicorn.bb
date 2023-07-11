SUMMARY = "An Asynchronous Server Gateway Interface server"
DESCRIPTION = "Uvicorn is an ASGI server implementation, using uvloop and httptools. \
It supports HTTP/1.1 and WebSockets only."
LICENSE = "BSD-3-Clause"

PV = "0.22.0"

RPM_NAME = "python310-uvicorn-0.22.0-2.1.noarch.rpm"
RPM_HASH = "ee14235cb5fbfcbddf37fd1ef8a52f2239bfa6b91687ce6ffd93ccb896e5ce51a7696791d551343fb09f7d1d14fe2e6cef7cef9a2d1d44d44ef0452fdb955d9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-uvicorn \
python310-uvicorn \
python3dist-uvicorn"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-click \
python310-h11 \
update-alternatives"

inherit rpm
