SUMMARY = "Cavium based arm64 systems"
DESCRIPTION = "Device Tree files for Cavium based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.3.1"

RPM_NAME = "dtb-cavium-6.3.1-1.2.aarch64.rpm"
RPM_HASH = "5d236348773ee9b584fdc1906b8e6e5e34c7d70cebaf02eed78c73c0693b44bc168e16d4f3b8d4fcead09db4e3faf9a1a5e0ffe79ce9aa1bf2ddbcdb52aee45a"

RPROVIDES:${PN} += "dtb-cavium dtb-cavium(aarch-64) dtb-thunder-88xx multiversion(dtb)"
RDEPENDS:${PN} += "/bin/sh coreutils"

inherit rpm
