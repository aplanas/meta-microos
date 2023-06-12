SUMMARY = "Renesas based arm64 systems"
DESCRIPTION = "Device Tree files for Renesas based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.3.4"

RPM_NAME = "dtb-renesas-6.3.4-1.1.aarch64.rpm"
RPM_HASH = "791ea80a88fbf45b0baed2eafa40aef6056523bd0f935f0182febe7bd7fb7029affe6d189ce93595ceaafccc0fad38cb703cb377b3ad3cb6fb31a5aec07d490a"

RPROVIDES:${PN} += "dtb-renesas \
dtb-renesas(aarch-64) \
multiversion(dtb)"
RDEPENDS:${PN} += "/bin/sh \
coreutils"

inherit rpm
