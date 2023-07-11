SUMMARY = "An Asynchronous Server Gateway Interface server"
DESCRIPTION = "Uvicorn is an ASGI server implementation, using uvloop and httptools. \
It supports HTTP/1.1 and WebSockets only."
LICENSE = "BSD-3-Clause"

PV = "0.22.0"

RPM_NAME = "python311-uvicorn-0.22.0-2.1.noarch.rpm"
RPM_HASH = "ea13a2ef8ef797e88b3980a2abcbf1b39e344c37c927fd14fa8bd48c715706ba2efeef1638e0cf2b95f131dfd43173384b1959953ff265958379295f073f1511"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-uvicorn \
python3.11dist-uvicorn \
python311-uvicorn \
python3dist-uvicorn"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-click \
python311-h11 \
update-alternatives"

inherit rpm
