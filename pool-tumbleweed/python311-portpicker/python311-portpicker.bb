SUMMARY = "A library to choose unique available network ports"
DESCRIPTION = "Portpicker provides an API to find and return an available network port for \
an application to bind to. Ideally suited for use from unittests or for test \
harnesses that launch local servers."
LICENSE = "Apache-2.0"

PV = "1.5.2"

RPM_NAME = "python311-portpicker-1.5.2-1.6.noarch.rpm"
RPM_HASH = "dee18147ceb2338cce964895944ccb02b30e6f94e24e282410aa9de1d0e459be6c6d7f2e72067a968d0c801e45aa9f7b1625a8c41b98fd5c2a1dc57487368176"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-portpicker \
python3.11dist-portpicker \
python311-portpicker \
python3dist-portpicker"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
