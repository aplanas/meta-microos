SUMMARY = "Development files for the KDE PIM Holiday API"
DESCRIPTION = "This package contains necessary include files and libraries needed \
to develop applications depending on the kholidays library"
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kholidays-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "d7f0eb823179c03e9d10acca558e03999545087606d7293c69cc932e44ed2f137404fd86ab0f7e897a257b230bd035c0eaac7742ea806cb8500f5b079bbc515f"

RPROVIDES:${PN} += "cmake(KF5Holidays) \
kholidays-devel \
kholidays-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt5Core) \
libKF5Holidays5"

inherit rpm
