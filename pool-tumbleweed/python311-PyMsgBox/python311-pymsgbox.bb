SUMMARY = "A Python module for JavaScript-like message boxes"
DESCRIPTION = "A pure Python module for JavaScript-like message boxes."
LICENSE = "BSD-3-Clause"

PV = "1.0.9"

RPM_NAME = "python311-PyMsgBox-1.0.9-1.4.noarch.rpm"
RPM_HASH = "fa5c276be19ce775a1bf93d6fd88b9c6e2b90b6dd7c7f50457abbc6d4011cde0be7350b4f334f95529e8acfc6d36df9e38299239f2ee33d0263f755fab42706b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyMsgBox \
python3.11dist-pymsgbox \
python311-PyMsgBox \
python3dist-pymsgbox"

RDEPENDS:${PN} += "python-abi"

inherit rpm
