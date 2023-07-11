SUMMARY = "Python library for working with the Tableau Server REST API"
DESCRIPTION = "A Python module for working with the Tableau Server REST API."
LICENSE = "MIT"

PV = "0.18.0"

RPM_NAME = "python310-tableauserverclient-0.18.0-1.9.noarch.rpm"
RPM_HASH = "f3fd7fa251cac96f257fbf0c8f45b4c02b8177bb4e4d62e7b1c42d432894f040ca1bc6c543d234a231aa29e5b4982c72e80e612fa923788621882de7e54813bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-tableauserverclient \
python310-tableauserverclient \
python3dist-tableauserverclient"

RDEPENDS:${PN} += "python-abi \
python310-requests"

inherit rpm
