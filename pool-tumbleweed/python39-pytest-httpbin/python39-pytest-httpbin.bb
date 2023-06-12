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

RPM_NAME = "python39-pytest-httpbin-1.0.2-3.1.noarch.rpm"
RPM_HASH = "f0fbeb52a6cc43ceeef6a54a40cce47898f64b19c2600554aca2a5f527b2c37586a70fe0ef090bd33419fa99228d70c6262845c9be7f02f1ac5c1b008b11b3f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-httpbin) \
python39-pytest-httpbin \
python3dist(pytest-httpbin)"
RDEPENDS:${PN} += "python(abi) \
python39-httpbin \
python39-pytest"

inherit rpm
