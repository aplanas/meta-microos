SUMMARY = "Development files for libmediawiki"
DESCRIPTION = "libmediawiki is a KDE C++ interface for MediaWiki based web services as \
wikipedia.org. \
 \
This package contains the development files for libmediawiki."
LICENSE = "GPL-2.0-or-later"

PV = "5.38.0"

RPM_NAME = "libmediawiki-devel-5.38.0-1.4.aarch64.rpm"
RPM_HASH = "b5ef610362880d5850b4ab8ae2f25aab2d937ef6ee47e12697dbc57bf77cc7a236153a2851deec1a9396b46b6fd81b2bdd63791dab39fa84dbbb3d063cd8d534"

RPROVIDES:${PN} += "cmake-KF5MediaWiki \
libmediawiki-devel"

RDEPENDS:${PN} += "cmake-KF5CoreAddons \
cmake-Qt5Core \
cmake-Qt5Network \
libKF5MediaWiki5"

inherit rpm
