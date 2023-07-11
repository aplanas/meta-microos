SUMMARY = "Parse HID report descriptors"
DESCRIPTION = "Typed pure Python library to parse HID report descriptors"
LICENSE = "MIT"

PV = "0.0.3"

RPM_NAME = "python39-hid-parser-0.0.3-1.5.noarch.rpm"
RPM_HASH = "90704d826a6ce8d2b0a382aa9bf91d558f68d06efc3a602e67dc15df2f1651c81b959806e2060ae2a72a0305aeebb95de035a8b3c863f67ddba1d77243f81e70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-hid-parser \
python39-hid-parser \
python3dist-hid-parser"

RDEPENDS:${PN} += "python-abi"

inherit rpm
