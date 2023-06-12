SUMMARY = "Parse HID report descriptors"
DESCRIPTION = "Typed pure Python library to parse HID report descriptors"
LICENSE = "MIT"

PV = "0.0.3"

RPM_NAME = "python311-hid-parser-0.0.3-1.3.noarch.rpm"
RPM_HASH = "59a844218318bf34c89168befbcb7ea56a24dd8bb202fc88d25a9f64feeb26239bb1454e463807542a469df0c85aa5431de0d06797173b8699a6ba31c039f423"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(hid-parser) \
python311-hid-parser \
python3dist(hid-parser)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
