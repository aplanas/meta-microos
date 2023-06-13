SUMMARY = "QR Code generator library"
DESCRIPTION = "This project aims to be the best, clearest QR Code generator library in multiple languages. \
The primary goals are flexible options and absolute correctness. \
Secondary goals are compact implementation size and good documentation comments."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "python311-QR-Code-generator-1.6.0-1.12.aarch64.rpm"
RPM_HASH = "43fc7fba12df88004d1d3d42f7560a9d32392902dfa107c73897528db422f54886f07b337fd1623599a941f081bf7223ff7783df11696fefc8d96d2652654ff4"

RPROVIDES:${PN} += "python3.11dist(qrcodegen) \
python311-QR-Code-generator \
python311-QR-Code-generator(aarch-64) \
python3dist(qrcodegen)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
