SUMMARY = "Configuration files for persistent reservation helper"
DESCRIPTION = "The pr-helper-conf package provides configuration files for persistent \
reservation helper"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "kubevirt-pr-helper-conf-1.0.0-1.1.aarch64.rpm"
RPM_HASH = "6ad4c3c0cee5c17166220876079214c1a4b54535805cfd323e37fb02e94e803925a50f86cd0117bed29692082c02921edaff185e1c6b981a60a23637730e3ac3"

RPROVIDES:${PN} += "kubevirt-pr-helper-conf"

RDEPENDS:${PN} += ""

inherit rpm
