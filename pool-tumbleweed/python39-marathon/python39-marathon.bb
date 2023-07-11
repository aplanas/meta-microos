SUMMARY = "Marathon Client Library"
DESCRIPTION = "Python interface to the Mesos Marathon REST API."
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "python39-marathon-0.13.0-2.8.noarch.rpm"
RPM_HASH = "b9a90552f48b8eb15728d74e6632e0a2e3822e260a5a1a62728d013f2eb83ba4a3502dce8f36edb27d2a48050df5f85f1ba78474c7e2f503b0fe76650e5246c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-marathon \
python39-marathon \
python3dist-marathon"

RDEPENDS:${PN} += "python-abi \
python39-requests \
python39-requests-toolbelt"

inherit rpm
