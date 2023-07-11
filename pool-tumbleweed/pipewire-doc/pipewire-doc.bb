SUMMARY = "PipeWire media server documentation"
DESCRIPTION = "This package contains documentation for the PipeWire media server."
LICENSE = "MIT"

PV = "0.3.72"

RPM_NAME = "pipewire-doc-0.3.72-1.1.aarch64.rpm"
RPM_HASH = "879b6da84f707aee97a9513288999e017cb66f23cb6b82fd7a9dce1b898917c2557e5a8775878bdb4d3482275034bcc00e783763b48a3a15d71a1302a4248b77"

RPROVIDES:${PN} += "pipewire-doc"

RDEPENDS:${PN} += ""

inherit rpm
