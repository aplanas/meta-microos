SUMMARY = "Library for KDE Games: Build Environment"
DESCRIPTION = "This package contains all necessary files and libraries needed to \
develop KDE games."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "libkdegames-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "b15ec2b6f12fd138b52a8f4381a87994c5f9fa53e9ac9bbac99b6c103a1f45788e20a59c9874646e3633b42edb7ea35ee46900ac39952620c097ef5f72df67af"

RPROVIDES:${PN} += "cmake-KF5KDEGames \
libkdegames-devel \
libkdegames-kf5-devel"

RDEPENDS:${PN} += "cmake-KF5Completion \
cmake-KF5Config \
cmake-KF5ConfigWidgets \
cmake-KF5I18n \
cmake-KF5WidgetsAddons \
cmake-Qt5Network \
cmake-Qt5Qml \
cmake-Qt5QuickWidgets \
cmake-Qt5Widgets \
cmake-Qt5Xml \
libKF5KDEGames7 \
libsndfile-devel \
openal-soft-devel"

inherit rpm
