SUMMARY = "Scripts for porting applications to KF5"
DESCRIPTION = "This package contains the scripts to make the porting KDE software from \
kdelibs and Qt4 to Qt5 and KDE Frameworks 5."
LICENSE = "GPL-2.0-only & GFDL-1.2-only"

PV = "23.04.3"

RPM_NAME = "kdesdk-scripts-kf5-porting-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "9df10085153f5c8a09644754fcf2458d019f7ca4468ce3844658bf542aaca0b12c7ca806660866ecdd0557176a85bd204213f48a69eec522bee2d7753d1322dd"

RPROVIDES:${PN} += "kdesdk-scripts-kf5-porting \
kdesdk4-scripts-kf5-porting \
perl-functionUtilkde"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/perl \
/usr/bin/sh"

inherit rpm
