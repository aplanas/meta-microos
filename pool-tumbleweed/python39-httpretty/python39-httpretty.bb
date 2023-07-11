SUMMARY = "HTTP client mocking tool for Python"
DESCRIPTION = "This library allows mocking of HTTP protocol based \
unit tests. \
It is similar to Ruby's FakeWeb."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "python39-httpretty-1.1.4-7.1.noarch.rpm"
RPM_HASH = "b554b85e22433832963048433cb2de3044ec737e4983650706c38174a384aca9c0efa83dbf069056dd639963baafc57773245f42bbcde8d1c338307e6cb0f557"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-httpretty \
python39-httpretty \
python3dist-httpretty"

RDEPENDS:${PN} += "python-abi"

inherit rpm
