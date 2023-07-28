SUMMARY = "PipeWire media server documentation"
DESCRIPTION = "This package contains documentation for the PipeWire media server."
LICENSE = "MIT"

PV = "0.3.74"

RPM_NAME = "pipewire-doc-0.3.74-1.1.aarch64.rpm"
RPM_HASH = "49b152b74d9bcc9b4a2ce809250aeaeadec1ec2dd6d66111de105d2669e4f8a0225575890a85d7ae134b510bc0154e4e07932d43fd303656bb90c3b2088fb396"

RPROVIDES:${PN} += "pipewire-doc"

RDEPENDS:${PN} += ""

inherit rpm
