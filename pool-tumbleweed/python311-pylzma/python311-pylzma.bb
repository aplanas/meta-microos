SUMMARY = "Python bindings for the LZMA compression library"
DESCRIPTION = "PyLZMA provides a platform independent way to read and write data \
that has been compressed or can be decompressed by the LZMA library."
LICENSE = "LGPL-2.1-only"

PV = "0.5.0"

RPM_NAME = "python311-pylzma-0.5.0-2.13.aarch64.rpm"
RPM_HASH = "faf5a73c484e2effc9de3260e52be02af964b7ab3e410879dd53168c83a38a255efbfd7ddd74434765a0bb8aae4d60920a911f76a38a89bfc0782e3e69a559ff"

RPROVIDES:${PN} += "python3-pylzma \
python3.11dist-pylzma \
python311-pylzma \
python3dist-pylzma"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
