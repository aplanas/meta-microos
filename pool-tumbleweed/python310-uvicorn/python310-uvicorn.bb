SUMMARY = "An Asynchronous Server Gateway Interface server"
DESCRIPTION = "Uvicorn is an ASGI server implementation, using uvloop and httptools. \
It supports HTTP/1.1 and WebSockets only."
LICENSE = "BSD-3-Clause"

PV = "0.22.0"

RPM_NAME = "python310-uvicorn-0.22.0-1.1.noarch.rpm"
RPM_HASH = "1c457e9e2e90190c7f76aa929b86f70aba753065d6ae33f8b8bf21cf8f7296d5609f386f99f10ee814fbcea525cd86bc9e89135740e6a37b0e24c13d74b5911a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-uvicorn \
python3.10dist-uvicorn \
python310-uvicorn \
python3dist-uvicorn"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-click \
python310-h11 \
update-alternatives"

inherit rpm
