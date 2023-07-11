SUMMARY = "Python Bindings for Google Protocol Buffers"
DESCRIPTION = "This package contains the Python bindings for Google Protocol Buffers."
LICENSE = "BSD-3-Clause"

PV = "4.23.3"

RPM_NAME = "python310-protobuf-4.23.3-5.1.aarch64.rpm"
RPM_HASH = "c6c0c5b30bcd64b1dd2bf956edb9191a21408dc02d9773f4bcd267f977257d3c081f1ec3af913fea3fa5e5f0149072bd18231eb698a837e1a5ef21644efde416"

RPROVIDES:${PN} += "python3.10dist-protobuf \
python310-protobuf \
python3dist-protobuf"

RDEPENDS:${PN} += "python-abi"

inherit rpm
