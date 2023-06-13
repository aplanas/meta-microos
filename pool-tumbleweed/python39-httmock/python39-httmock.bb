SUMMARY = "A mocking library for requests"
DESCRIPTION = "A mocking library for requests. \
 \
You can use it to mock third-party APIs and test libraries that use \
`requests` internally, conditionally using mocked replies with the \
`urlmatch` decorator."
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "python39-httmock-1.4.0-1.11.noarch.rpm"
RPM_HASH = "0e1cf9d7402f27ccbda375c30c4e2c8732e87b1b2c228d8da413b98cff11aaa0614981aaf719438ff506f0eea7e3003815936651771e774159f6688843a69ec5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(httmock) \
python39-httmock \
python3dist(httmock)"

RDEPENDS:${PN} += "python(abi) \
python39-requests"

inherit rpm
