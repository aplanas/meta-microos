SUMMARY = "An Asynchronous Server Gateway Interface server"
DESCRIPTION = "Uvicorn is an ASGI server implementation, using uvloop and httptools. \
It supports HTTP/1.1 and WebSockets only."
LICENSE = "BSD-3-Clause"

PV = "0.22.0"

RPM_NAME = "python311-uvicorn-0.22.0-1.1.noarch.rpm"
RPM_HASH = "baae6683122222128c1ce39230a9ef21977d829be60a990ffc4e32034e469a09911d4099c045908a775c065e87cbbf9e4126b3371ce9a7b9ccc6fd83eef5d886"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-uvicorn \
python311-uvicorn \
python3dist-uvicorn"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python311-click \
python311-h11 \
update-alternatives"

inherit rpm
