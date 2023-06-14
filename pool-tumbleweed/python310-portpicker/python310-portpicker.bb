SUMMARY = "A library to choose unique available network ports"
DESCRIPTION = "Portpicker provides an API to find and return an available network port for \
an application to bind to. Ideally suited for use from unittests or for test \
harnesses that launch local servers."
LICENSE = "Apache-2.0"

PV = "1.5.2"

RPM_NAME = "python310-portpicker-1.5.2-1.5.noarch.rpm"
RPM_HASH = "b08723bc9aedeed416dcecba4c0683f7bf7177c6bad0f8857e4a48c4b9077296916ef3c0b165b3cdbfc058220b9c646f8d80242dc9fd3206fcfc2bb5503c0e09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-portpicker \
python3.10dist-portpicker \
python310-portpicker \
python3dist-portpicker"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
update-alternatives"

inherit rpm
