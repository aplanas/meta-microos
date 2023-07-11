SUMMARY = "HTTP client mocking tool for Python"
DESCRIPTION = "This library allows mocking of HTTP protocol based \
unit tests. \
It is similar to Ruby's FakeWeb."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "python311-httpretty-1.1.4-7.1.noarch.rpm"
RPM_HASH = "f6b58461635b5fdb3119b046afc29d64ee2db4b768fec696acd199e1bc0ec7e34f5b826d5e2db4943f5fe87968ef60267308644cb58b59885936c9508f08406e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-httpretty \
python3.11dist-httpretty \
python311-httpretty \
python3dist-httpretty"

RDEPENDS:${PN} += "python-abi"

inherit rpm
