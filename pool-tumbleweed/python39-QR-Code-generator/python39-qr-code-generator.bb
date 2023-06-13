SUMMARY = "QR Code generator library"
DESCRIPTION = "This project aims to be the best, clearest QR Code generator library in multiple languages. \
The primary goals are flexible options and absolute correctness. \
Secondary goals are compact implementation size and good documentation comments."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "python39-QR-Code-generator-1.6.0-1.12.aarch64.rpm"
RPM_HASH = "770509573782b41eb4240ab1a4c266784b83622929c9d07e67f5552fc6f29400f66c2d511add94a9977333c42554e096df09a69c6258d3c1cd49c66d4e75037c"

RPROVIDES:${PN} += "python3.9dist(qrcodegen) \
python39-QR-Code-generator \
python39-QR-Code-generator(aarch-64) \
python3dist(qrcodegen)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
