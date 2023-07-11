SUMMARY = "Parse HID report descriptors"
DESCRIPTION = "Typed pure Python library to parse HID report descriptors"
LICENSE = "MIT"

PV = "0.0.3"

RPM_NAME = "python311-hid-parser-0.0.3-1.5.noarch.rpm"
RPM_HASH = "054ca1be8291d1b5ba519d3a2a044b4f67b106161e1b2fade11a35c4cef264efe730ae39440e19928c076501ffce382afb42769c8fe70562a7f03b6403b0dfb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hid-parser \
python3.11dist-hid-parser \
python311-hid-parser \
python3dist-hid-parser"

RDEPENDS:${PN} += "python-abi"

inherit rpm
