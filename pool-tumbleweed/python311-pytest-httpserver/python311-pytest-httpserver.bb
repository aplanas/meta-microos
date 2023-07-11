SUMMARY = "A HTTP server for pytest"
DESCRIPTION = "This library is for testing HTTP clients without contacting the real \
HTTP server. In other words, it is a fake HTTP server which is \
accessible via localhost can be started with the pre-defined expected \
HTTP requests and their responses."
LICENSE = "MIT"

PV = "1.0.8"

RPM_NAME = "python311-pytest-httpserver-1.0.8-1.3.noarch.rpm"
RPM_HASH = "5ebdfee605582e2731f4bfca5cf19c780cd55c76aa5cde713963c21c2a8ef17a259fa48f923622225899544af415712cdc9a0421769997bfbdfa74b543b67ec9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-httpserver \
python3.11dist-pytest-httpserver \
python311-pytest-httpserver \
python3dist-pytest-httpserver"

RDEPENDS:${PN} += "python-abi \
python311-Werkzeug \
python311-pytest"

inherit rpm
