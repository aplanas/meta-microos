SUMMARY = "PipeWire media server documentation"
DESCRIPTION = "This package contains documentation for the PipeWire media server."
LICENSE = "MIT"

PV = "0.3.79"

RPM_NAME = "pipewire-doc-0.3.79-1.2.aarch64.rpm"
RPM_HASH = "51120bbb4096370fbcc77be2c7cde4b39b17272f682200137c19bbd46e9a940fba4ce1670efb2fbfca5f2fd32c46478356ac2ffd249d888b15d1395a08422e76"

RPROVIDES:${PN} += "pipewire-doc"

RDEPENDS:${PN} += ""

inherit rpm
