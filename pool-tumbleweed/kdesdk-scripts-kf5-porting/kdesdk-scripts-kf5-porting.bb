SUMMARY = "Scripts for porting applications to KF5"
DESCRIPTION = "This package contains the scripts to make the porting KDE software from \
kdelibs and Qt4 to Qt5 and KDE Frameworks 5."
LICENSE = "GPL-2.0-only & GFDL-1.2-only"

PV = "23.08.0"

RPM_NAME = "kdesdk-scripts-kf5-porting-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "acf2a871014f534ea527b5828c9c1c94e18f8336e2ec271006fd1741dd93302136751b5a3c4fe8c279a07d7787e58796882524294301b25327b93b1641b3ce3e"

RPROVIDES:${PN} += "kdesdk-scripts-kf5-porting \
kdesdk4-scripts-kf5-porting \
perl-functionUtilkde"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/perl \
/usr/bin/sh"

inherit rpm
