SUMMARY = "Devel files for python310-PyQt6-Charts"
DESCRIPTION = "This package provides Qt6 API files for the Eric IDE and the SIP files \
used to generate the Python bindings for python310-PyQt6-Charts"
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python310-PyQt6-Charts-devel-6.5.0-1.3.aarch64.rpm"
RPM_HASH = "62b9a5b1eb577d2b6dd18606b6597a649a35256e9efd3d71591ca9b9a45e68263a79e8c709fd0bdc6d3ebe54047cdab20f155ede53f36d1f7900c87c6e18776b"

RPROVIDES:${PN} += "python310-PyQt6-Charts-devel"

RDEPENDS:${PN} += "python-abi \
python310-PyQt6-devel"

inherit rpm
