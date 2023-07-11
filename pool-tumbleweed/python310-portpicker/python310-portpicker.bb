SUMMARY = "A library to choose unique available network ports"
DESCRIPTION = "Portpicker provides an API to find and return an available network port for \
an application to bind to. Ideally suited for use from unittests or for test \
harnesses that launch local servers."
LICENSE = "Apache-2.0"

PV = "1.5.2"

RPM_NAME = "python310-portpicker-1.5.2-1.6.noarch.rpm"
RPM_HASH = "f82b346c23320ab92be232c0e8eaa7b0ec3ffb20aba62a467a3c68bafabe91a31fe2e48101540885d429cde75e8b7b621449ef9a7f00fd88bca1606189b2e7fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-portpicker \
python310-portpicker \
python3dist-portpicker"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
