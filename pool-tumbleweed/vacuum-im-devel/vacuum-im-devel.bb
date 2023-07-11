SUMMARY = "Development files for Vacuum-IM"
DESCRIPTION = "This package includes files needed to develop Vacuum-IM modules."
LICENSE = "GPL-3.0-only"

PV = "1.3.0+git1571036065.9f3952b2"

RPM_NAME = "vacuum-im-devel-1.3.0+git1571036065.9f3952b2-1.21.aarch64.rpm"
RPM_HASH = "194264cc2d4a592adb85a6abbc26b7ca0313bb4e9cb39e6af4e9d4386f93b67b81edefb36bf14107f4413f2c7d01229a12a8af808bc9fd2f47fdfbda6f0ee6f5"

RPROVIDES:${PN} += "vacuum-im-devel"

RDEPENDS:${PN} += "libvacuumutils37 \
vacuum-im"

inherit rpm
