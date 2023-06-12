SUMMARY = "HTTP client mocking tool for Python"
DESCRIPTION = "This library allows mocking of HTTP protocol based \
unit tests. \
It is similar to Ruby's FakeWeb."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "python39-httpretty-1.1.4-5.2.noarch.rpm"
RPM_HASH = "0a5760108fc3fc1b90f4656954de522d7f28a32734596f0c4aa263001dccf5b5004ca0fead783bf5476452e01bc28c71cae24e5c20671b8f3a7a546ce1159933"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(httpretty) \
python39-httpretty \
python3dist(httpretty)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
