SUMMARY = "A mocking library for requests"
DESCRIPTION = "A mocking library for requests. \
 \
You can use it to mock third-party APIs and test libraries that use \
`requests` internally, conditionally using mocked replies with the \
`urlmatch` decorator."
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "python310-httmock-1.4.0-1.11.noarch.rpm"
RPM_HASH = "ad13ea76da79b43235fe82dff805e1dd73480d099d2c0671aeea56e78b2027d0f23cc17882a80568f22e536a30e906f9f3c5513fbbb3e46749d5da97efbb8413"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-httmock \
python3.10dist(httmock) \
python310-httmock \
python3dist(httmock)"
RDEPENDS:${PN} += "python(abi) \
python310-requests"

inherit rpm
