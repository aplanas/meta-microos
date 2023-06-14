SUMMARY = "AMD based arm64 systems"
DESCRIPTION = "Device Tree files for AMD based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.3.4"

RPM_NAME = "dtb-amd-6.3.4-1.1.aarch64.rpm"
RPM_HASH = "c2781158bca586d215d2efceb10a23e903bae56f96c489364ac949ab7ab4851e548a0f297571077c0cdd56fed7f734effacc2d151d2e96606998d224ff9035db"

RPROVIDES:${PN} += "dtb-amd \
multiversion-dtb"

RDEPENDS:${PN} += "/bin/sh \
coreutils"

inherit rpm
