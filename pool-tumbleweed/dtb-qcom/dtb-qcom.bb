SUMMARY = "Qualcomm based arm64 systems"
DESCRIPTION = "Device Tree files for Qualcomm based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.4.3"

RPM_NAME = "dtb-qcom-6.4.3-1.1.aarch64.rpm"
RPM_HASH = "8b111021c18ac6e09e04e43587adfd0dd0888fdadf06171aeca27e4dc8cc6130c8a2d572f3d9e3ec20b0abcad0bdc70b24847292a49e1c18f9be28d98660a739"

RPROVIDES:${PN} += "dtb-qcom \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
