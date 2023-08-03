SUMMARY = "Devel files for python311-PyQt6-Charts"
DESCRIPTION = "This package provides Qt6 API files for the Eric IDE and the SIP files \
used to generate the Python bindings for python311-PyQt6-Charts"
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python311-PyQt6-Charts-devel-6.5.0-1.4.aarch64.rpm"
RPM_HASH = "182f3cdccbcfc04ed4e0ee60db4589736845142ad72d80af642255f039137844a9b0f93727da747ed589b1ab8b4a2caaedb3a0607a1db23c6d507cc7afc393f8"

RPROVIDES:${PN} += "python3-PyQt6-Charts-devel \
python311-PyQt6-Charts-devel"

RDEPENDS:${PN} += "python-abi \
python311-PyQt6-devel"

inherit rpm
