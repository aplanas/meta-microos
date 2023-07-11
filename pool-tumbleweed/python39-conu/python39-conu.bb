SUMMARY = "Python container testing library"
DESCRIPTION = "Python container testing library."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-conu-1.0.0-2.5.noarch.rpm"
RPM_HASH = "3e1ec73b7898a133b0fc52a876dec32fefea3f0b84d3ead16bfe801a903884bb6f76f5f132f834739e4ed1106734d49c5b3c0075fe44a4db0131cf3826e9ffd4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-conu \
python39-conu \
python3dist-conu"

RDEPENDS:${PN} += "python-abi \
python39-docker \
python39-flexmock \
python39-kubernetes \
python39-pytest \
python39-requests"

inherit rpm
