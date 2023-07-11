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

RPM_NAME = "python311-pytest-httpbin-1.0.2-3.3.noarch.rpm"
RPM_HASH = "129c91b478618a975d0b449235c2d44d761051878cf07d052d4722adccc22c4bfd441b274cb11a3549422161c5aea56d2786aa2682dd56cace147231b5e86859"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-httpbin \
python3.11dist-pytest-httpbin \
python311-pytest-httpbin \
python3dist-pytest-httpbin"

RDEPENDS:${PN} += "python-abi \
python311-httpbin \
python311-pytest"

inherit rpm
