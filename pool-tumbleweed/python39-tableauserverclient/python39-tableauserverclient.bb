SUMMARY = "Python library for working with the Tableau Server REST API"
DESCRIPTION = "A Python module for working with the Tableau Server REST API."
LICENSE = "MIT"

PV = "0.18.0"

RPM_NAME = "python39-tableauserverclient-0.18.0-1.9.noarch.rpm"
RPM_HASH = "168510f043a27dc79c987239fcfacc2ae9a45785b57fc945d5007d7cd96a7393271b3bfa45426fd07ce9980fe3f05e94e749dfdb6bf3e933c641cc4a765e4581"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-tableauserverclient \
python39-tableauserverclient \
python3dist-tableauserverclient"

RDEPENDS:${PN} += "python-abi \
python39-requests"

inherit rpm
