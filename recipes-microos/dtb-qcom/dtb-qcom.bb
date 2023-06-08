SUMMARY = "Qualcomm based arm64 systems"
DESCRIPTION = "Device Tree files for Qualcomm based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "6.3.1"

RPM_NAME = "dtb-qcom-6.3.1-1.2.aarch64.rpm"
RPM_HASH = "87164d71218cbd075ff9bf07083c570b9e8e5419931ee076c39e55c3bfa08375de2c3bd6421e1506c1a82fc9b581aeb69a5ee0bad2e13df65adb3d7097497a27"

RPROVIDES:${PN} += "dtb-qcom dtb-qcom(aarch-64) multiversion(dtb)"
RDEPENDS:${PN} += "/bin/sh coreutils"

inherit rpm
