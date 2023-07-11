SUMMARY = "A HTTP server for pytest"
DESCRIPTION = "This library is for testing HTTP clients without contacting the real \
HTTP server. In other words, it is a fake HTTP server which is \
accessible via localhost can be started with the pre-defined expected \
HTTP requests and their responses."
LICENSE = "MIT"

PV = "1.0.8"

RPM_NAME = "python310-pytest-httpserver-1.0.8-1.3.noarch.rpm"
RPM_HASH = "6ee788dc76b2db4fb8e4f24b1ca4f443e023f25db2066b684d2fd6fa0c8e05296073e0107096f33ef53df724dd11b95010b137a4792b24f2c4a7ba8887721488"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-httpserver \
python310-pytest-httpserver \
python3dist-pytest-httpserver"

RDEPENDS:${PN} += "python-abi \
python310-Werkzeug \
python310-pytest"

inherit rpm
