SUMMARY = "Local Extensions for Apache Maven"
DESCRIPTION = "This package provides extensions for Apache Maven that can be used to \
manage system artifact repository and use it to resolve Maven \
artifacts in offline mode, as well as Maven plugins to help with \
creating RPM packages containing Maven artifacts."
LICENSE = "Apache-2.0"

PV = "4.2.0"

RPM_NAME = "xmvn-4.2.0-2.2.aarch64.rpm"
RPM_HASH = "9745cdc1130e2c964072eaf3b5793475ce3208d2278d564a7d487597e18151b62de80a668d75b46a03e57f3ba6746fb9e25f5e4effcb8ca769604202b64c351e"

RPROVIDES:${PN} += "xmvn"

RDEPENDS:${PN} += "xmvn-minimal"

inherit rpm
