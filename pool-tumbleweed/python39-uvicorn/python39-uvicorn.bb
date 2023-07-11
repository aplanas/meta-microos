SUMMARY = "An Asynchronous Server Gateway Interface server"
DESCRIPTION = "Uvicorn is an ASGI server implementation, using uvloop and httptools. \
It supports HTTP/1.1 and WebSockets only."
LICENSE = "BSD-3-Clause"

PV = "0.22.0"

RPM_NAME = "python39-uvicorn-0.22.0-2.1.noarch.rpm"
RPM_HASH = "fee7348e721830e363d579258674bc90ad9483481bbec5445e5f20884265d2bd77243844c7f80828c8087103091048a91ce8748cdff5014c3739a03f102fedc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-uvicorn \
python39-uvicorn \
python3dist-uvicorn"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-click \
python39-h11 \
update-alternatives"

inherit rpm
