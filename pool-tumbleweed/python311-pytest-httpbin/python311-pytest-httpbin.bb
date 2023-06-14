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

RPM_NAME = "python311-pytest-httpbin-1.0.2-3.1.noarch.rpm"
RPM_HASH = "bfaefb4b7b2683584917fe823a9d1f47e1c7df4769f5a4b47cdf88d6db209d9df927bc6a170e091d4204bdb2953c25818f700a98b9c77604f91642b8b51ff1d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pytest-httpbin \
python311-pytest-httpbin \
python3dist-pytest-httpbin"

RDEPENDS:${PN} += "python-abi \
python311-httpbin \
python311-pytest"

inherit rpm
