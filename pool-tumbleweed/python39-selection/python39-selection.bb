SUMMARY = "API to extract content from HTML & XML documents"
DESCRIPTION = "API to extract content from HTML & XML documents"
LICENSE = "MIT"

PV = "0.0.21"

RPM_NAME = "python39-selection-0.0.21-1.3.noarch.rpm"
RPM_HASH = "710de0842149b8d04da33e70209b00d85ca0adb612dec5a69d19efc7880d73b4d9b14595e2bfa24fc4f2bb225c86ee68f1cf6ccf65039e779b1538860b6a2232"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-selection \
python39-selection \
python3dist-selection"

RDEPENDS:${PN} += "python-abi \
python39-lxml"

inherit rpm
