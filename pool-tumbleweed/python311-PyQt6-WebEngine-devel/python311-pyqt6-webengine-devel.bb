SUMMARY = "Devel files for python311-PyQt6-WebEngine"
DESCRIPTION = "This package provides Qt6 API files for the Eric IDE and the SIP files \
used to generate the Python bindings for python311-PyQt6-WebEngine"
LICENSE = "GPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "python311-PyQt6-WebEngine-devel-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "da3092a541438a046a9fbf938d3af07e557c15a40068a4e94c54d9534556d9344cc3a2b322efb0b5645b98e726a63a2d92c1eb16d74dfc4e99df6ee827cf2661"

RPROVIDES:${PN} += "python3-PyQt6-WebEngine-devel \
python311-PyQt6-WebEngine-devel"

RDEPENDS:${PN} += "python311-PyQt6-devel"

inherit rpm
