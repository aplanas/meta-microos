SUMMARY = "A HTTP server for pytest"
DESCRIPTION = "This library is for testing HTTP clients without contacting the real \
HTTP server. In other words, it is a fake HTTP server which is \
accessible via localhost can be started with the pre-defined expected \
HTTP requests and their responses."
LICENSE = "MIT"

PV = "1.0.8"

RPM_NAME = "python39-pytest-httpserver-1.0.8-1.3.noarch.rpm"
RPM_HASH = "f3a1335d35993b85026f5deaa4f94e336586ee6a4c6d62fb39ca4c7f8ef490c806d4c1580205fcb8029467ed8e3ce538bc253517e3c66a1e9dc7abce5d0de825"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-httpserver \
python39-pytest-httpserver \
python3dist-pytest-httpserver"

RDEPENDS:${PN} += "python-abi \
python39-Werkzeug \
python39-pytest"

inherit rpm
