SUMMARY = "QR Code generator library"
DESCRIPTION = "This project aims to be the best, clearest QR Code generator library in multiple languages. \
The primary goals are flexible options and absolute correctness. \
Secondary goals are compact implementation size and good documentation comments."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "python311-QR-Code-generator-1.6.0-1.13.aarch64.rpm"
RPM_HASH = "a909395982f641413cf18f006a812bef86bf3601d6ce570dccd8b1b8a179ad9d8f4f8a85fd4cafd2cfe10649b87d730e172902ddad907e13078c69d4a90949f2"

RPROVIDES:${PN} += "python3-QR-Code-generator \
python3.11dist-qrcodegen \
python311-QR-Code-generator \
python3dist-qrcodegen"

RDEPENDS:${PN} += "python-abi"

inherit rpm
