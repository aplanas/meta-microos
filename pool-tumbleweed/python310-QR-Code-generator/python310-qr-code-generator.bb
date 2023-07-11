SUMMARY = "QR Code generator library"
DESCRIPTION = "This project aims to be the best, clearest QR Code generator library in multiple languages. \
The primary goals are flexible options and absolute correctness. \
Secondary goals are compact implementation size and good documentation comments."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "python310-QR-Code-generator-1.6.0-1.13.aarch64.rpm"
RPM_HASH = "bb179a6c82cc47207b73145564a988437b702ef81f86497f46d833438287c0b583ac735fe813f0a6ca0ce87961d4a5c32817ebd3cc6cc713bffb045afc004748"

RPROVIDES:${PN} += "python3.10dist-qrcodegen \
python310-QR-Code-generator \
python3dist-qrcodegen"

RDEPENDS:${PN} += "python-abi"

inherit rpm
