SUMMARY = "A py.test plugin for tornado applications"
DESCRIPTION = "A py.test_ plugin providing fixtures and markers to simplify testing \
of asynchronous tornado applications."
LICENSE = "Apache-2.0"

PV = "0.8.1"

RPM_NAME = "python39-pytest-tornado-0.8.1-1.14.noarch.rpm"
RPM_HASH = "f1e8a37dad6e117535f852cd7061b505a3e826940b285f6e84ee8562cec958115dfc58d982ff83cf91d70278c62ca5af44a1ef1ea01e51e9c3e2408a91a46ad3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-tornado \
python39-pytest-tornado \
python3dist-pytest-tornado"

RDEPENDS:${PN} += "python-abi \
python39-certifi \
python39-pytest \
python39-tornado"

inherit rpm
