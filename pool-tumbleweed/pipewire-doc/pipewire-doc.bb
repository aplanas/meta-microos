SUMMARY = "PipeWire media server documentation"
DESCRIPTION = "This package contains documentation for the PipeWire media server."
LICENSE = "MIT"

PV = "0.3.76"

RPM_NAME = "pipewire-doc-0.3.76-1.1.aarch64.rpm"
RPM_HASH = "271d8cac5cd7b36a22a037c2c2622498966152de54695318e5681b91697c34a3cd2107c650bce6a2cf27114204e1dd5a861f4c4b583433c3942ad2f3bf25de0c"

RPROVIDES:${PN} += "pipewire-doc"

RDEPENDS:${PN} += ""

inherit rpm
