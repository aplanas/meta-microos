SUMMARY = "HTTP client mocking tool for Python"
DESCRIPTION = "This library allows mocking of HTTP protocol based \
unit tests. \
It is similar to Ruby's FakeWeb."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "python310-httpretty-1.1.4-7.1.noarch.rpm"
RPM_HASH = "688f8777962a6caa9f492eaa89411c83d332104a7f4ea2bb7c4b0b68d37994643f4e03029c609e213c9e692f702259e055563019fb9b1ed4ccbe95a450cb0285"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-httpretty \
python310-httpretty \
python3dist-httpretty"

RDEPENDS:${PN} += "python-abi"

inherit rpm
