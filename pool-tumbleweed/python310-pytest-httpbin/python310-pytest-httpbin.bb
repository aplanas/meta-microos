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

RPM_NAME = "python310-pytest-httpbin-1.0.2-3.3.noarch.rpm"
RPM_HASH = "a2a9a275cd70d4733822a95bbf03775761b808b881417622306074924f6b145d3f480aa650158193ee8525f5d8e99433d475ac3a373cb592ac10be2a64c2165d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-httpbin \
python310-pytest-httpbin \
python3dist-pytest-httpbin"

RDEPENDS:${PN} += "python-abi \
python310-httpbin \
python310-pytest"

inherit rpm
