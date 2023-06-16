SUMMARY = "An Asynchronous Server Gateway Interface server"
DESCRIPTION = "Uvicorn is an ASGI server implementation, using uvloop and httptools. \
It supports HTTP/1.1 and WebSockets only."
LICENSE = "BSD-3-Clause"

PV = "0.22.0"

RPM_NAME = "python39-uvicorn-0.22.0-1.1.noarch.rpm"
RPM_HASH = "461d854f61363049d07d47de67e1025dae16f2d15b0f95dc255bfcaa458aff5ceaf7c0adf9a255547692faedce99249e607fd61adf74301207ed4154d7bea30f"
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
