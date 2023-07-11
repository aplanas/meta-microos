SUMMARY = "Pytest plugin for coverage reporting"
DESCRIPTION = "Hunter is a flexible code tracing toolkit, not for measuring coverage, \
but for debugging, logging, inspection and other nefarious purposes."
LICENSE = "BSD-2-Clause"

PV = "3.5.1"

RPM_NAME = "python311-hunter-3.5.1-1.7.aarch64.rpm"
RPM_HASH = "557a31d9677a96ed97b22363280296139222d16c4aae96dfcb78f7c177059edf7d9248ba5b21a1b7c57927716c860822c6aa41ee0c46da66609736004b20a139"

RPROVIDES:${PN} += "python3-hunter \
python3.11dist-hunter \
python311-hunter \
python3dist-hunter"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
