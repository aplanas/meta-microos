SUMMARY = "A mocking library for requests"
DESCRIPTION = "A mocking library for requests. \
 \
You can use it to mock third-party APIs and test libraries that use \
`requests` internally, conditionally using mocked replies with the \
`urlmatch` decorator."
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "python39-httmock-1.4.0-1.13.noarch.rpm"
RPM_HASH = "80a362276967b7c0576394f1ecbee22e62431f60eaaaaef5e9425295ef2aea0b2800466674fff78bf323987d9c9700fe786066a60380eab0ac3b4d7b5a019974"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-httmock \
python39-httmock \
python3dist-httmock"

RDEPENDS:${PN} += "python-abi \
python39-requests"

inherit rpm
