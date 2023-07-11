SUMMARY = "Web service for testing HTTP libraries"
DESCRIPTION = "httpbin is a web service for testing HTTP libraries. It has several \
endpoints that can test parts needed in a HTTP library. \
 \
Pytest-httpbin creates a pytest 'fixture' that is \
dependency-injected into your tests. It automatically starts up a HTTP server \
in a separate thread running httpbin and provides your test with the URL in the \
fixture."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "python39-pytest-httpbin-1.0.2-3.3.noarch.rpm"
RPM_HASH = "4b417885df33b598f3c0e1c586166bd63b52e6ace2f4acaaa43917481a18db8fa653283f33480325c2ac87fd8455e8bb9635961a833d04249d19a6432bb7427e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-httpbin \
python39-pytest-httpbin \
python3dist-pytest-httpbin"

RDEPENDS:${PN} += "python-abi \
python39-httpbin \
python39-pytest"

inherit rpm
