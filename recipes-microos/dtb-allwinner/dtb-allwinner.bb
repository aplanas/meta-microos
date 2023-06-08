SUMMARY = "Allwinner based arm64 systems"
DESCRIPTION = "Device Tree files for Allwinner based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.3.1"

RPM_NAME = "dtb-allwinner-6.3.1-1.2.aarch64.rpm"
RPM_HASH = "86347891f81a2afcf072dcc79996b35b41d034cef5757e54e303510f6f328dcdff5b4b6a1df023c25a95f7d7a1cf6f5af9d9f05f6d4476ac1f9ccb7c98a44a38"

RPROVIDES:${PN} += "dtb-allwinner dtb-allwinner(aarch-64) multiversion(dtb)"
RDEPENDS:${PN} += "/bin/sh coreutils"

inherit rpm
