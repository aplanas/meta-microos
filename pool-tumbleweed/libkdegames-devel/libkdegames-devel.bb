SUMMARY = "Library for KDE Games: Build Environment"
DESCRIPTION = "This package contains all necessary files and libraries needed to \
develop KDE games."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "libkdegames-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "d96decc56e161819c70a104788f9e5623ed27378cc5679f0218f7a24f3ce5d1a94eedd8f8741f65aa0a39684ae4400d1c9d44e2ae07246e383e087bf915d3d4e"

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
