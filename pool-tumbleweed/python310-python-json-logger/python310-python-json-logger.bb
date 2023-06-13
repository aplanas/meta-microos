SUMMARY = "A python library adding a json log formatter"
DESCRIPTION = "A python library adding a json log formatter."
LICENSE = "BSD-2-Clause"

PV = "2.0.7"

RPM_NAME = "python310-python-json-logger-2.0.7-1.1.noarch.rpm"
RPM_HASH = "77ef54f5f7f80a57915dcbdd37ad83520b87e835bc9232a85bd69fbaca6f6b5b6c98af1ff1f8cec701da58f4c3f7f768bcaa663e043acb606e544b51b31c924a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-json-logger \
python3.10dist(python-json-logger) \
python310-python-json-logger \
python3dist(python-json-logger)"

RDEPENDS:${PN} += "python(abi) \
python310-setuptools"

inherit rpm
