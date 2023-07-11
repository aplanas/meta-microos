SUMMARY = "Parse HID report descriptors"
DESCRIPTION = "Typed pure Python library to parse HID report descriptors"
LICENSE = "MIT"

PV = "0.0.3"

RPM_NAME = "python310-hid-parser-0.0.3-1.5.noarch.rpm"
RPM_HASH = "637860d5ee378a7f09183b57e9ed201c27d3ec584bb2c781ebd6e6beb867db6b9802a2b1eed77f15c68118975b534dd959d4d65f236a5aa9f6560d11e06d4224"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-hid-parser \
python310-hid-parser \
python3dist-hid-parser"

RDEPENDS:${PN} += "python-abi"

inherit rpm
