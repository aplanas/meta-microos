SUMMARY = "Devel files for python39-PyQt6-Charts"
DESCRIPTION = "This package provides Qt6 API files for the Eric IDE and the SIP files \
used to generate the Python bindings for python39-PyQt6-Charts"
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python39-PyQt6-Charts-devel-6.5.0-1.3.aarch64.rpm"
RPM_HASH = "f5e2031869de2bc1f5ff27c4b20be840989d90d266a2f232babae8d85a96f08d04f61ce9d9d592e427aabd730e537cccd7114b79f83556b69c80ac29c4577dbf"

RPROVIDES:${PN} += "python39-PyQt6-Charts-devel"

RDEPENDS:${PN} += "python-abi \
python39-PyQt6-devel"

inherit rpm
