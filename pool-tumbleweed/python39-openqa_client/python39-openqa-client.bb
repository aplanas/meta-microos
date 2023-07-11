SUMMARY = "Python openQA client library"
DESCRIPTION = "This is a client for the openQA API, based on requests."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.1"

RPM_NAME = "python39-openqa_client-4.2.1-1.5.noarch.rpm"
RPM_HASH = "779b64a9b0deec58a1486295a9c7c37e84a28a41b1a6e7e78af8387c83eca44b778c54178acacec4329940bdcf0cb56400c906b9439bdf58de40a7d9e70e4e64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-openqa-client \
python39-openqa-client \
python3dist-openqa-client"

RDEPENDS:${PN} += "python-abi \
python39-PyYAML \
python39-requests \
python39-typing-extensions"

inherit rpm
