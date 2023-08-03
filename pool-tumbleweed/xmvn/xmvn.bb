SUMMARY = "Local Extensions for Apache Maven"
DESCRIPTION = "This package provides extensions for Apache Maven that can be used to \
manage system artifact repository and use it to resolve Maven \
artifacts in offline mode, as well as Maven plugins to help with \
creating RPM packages containing Maven artifacts."
LICENSE = "Apache-2.0"

PV = "4.2.0"

RPM_NAME = "xmvn-4.2.0-3.1.aarch64.rpm"
RPM_HASH = "69c78e0b451a2f42a555544216d9f0133ba0d073855dbf9783dbbad5a454292e9993160af2ed8a5701c22806d3caec0b63b1e8c5950c1510409ebe4024e311ed"

RPROVIDES:${PN} += "xmvn"

RDEPENDS:${PN} += "xmvn-minimal"

inherit rpm
