SUMMARY = "QR Code generator library"
DESCRIPTION = "This project aims to be the best, clearest QR Code generator library in multiple languages. \
The primary goals are flexible options and absolute correctness. \
Secondary goals are compact implementation size and good documentation comments."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "python39-QR-Code-generator-1.6.0-1.13.aarch64.rpm"
RPM_HASH = "ac1f66051797a4cf35a673936e41ed33b6110be3580406f785d287a15e694705dae364917b8d8fe123db4cae3e472763a6dd0cb9c42d0c1d3cbaf81c34486ca9"

RPROVIDES:${PN} += "python3.9dist-qrcodegen \
python39-QR-Code-generator \
python3dist-qrcodegen"

RDEPENDS:${PN} += "python-abi"

inherit rpm
