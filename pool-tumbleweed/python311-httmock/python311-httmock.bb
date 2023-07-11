SUMMARY = "A mocking library for requests"
DESCRIPTION = "A mocking library for requests. \
 \
You can use it to mock third-party APIs and test libraries that use \
`requests` internally, conditionally using mocked replies with the \
`urlmatch` decorator."
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "python311-httmock-1.4.0-1.13.noarch.rpm"
RPM_HASH = "ff14b49c820d958b3a96c05b00d59d2099a42cf1bc16942566c627a803a562a9780fcb7c4e9810fe7cdd72f788dd51fdcd09682bceab24086223ea3518608379"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-httmock \
python3.11dist-httmock \
python311-httmock \
python3dist-httmock"

RDEPENDS:${PN} += "python-abi \
python311-requests"

inherit rpm
