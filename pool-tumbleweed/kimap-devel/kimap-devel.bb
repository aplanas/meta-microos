SUMMARY = "KDE PIM Libraries: Build Environment"
DESCRIPTION = "This package contains development headers to add IMAP support to PIM \
applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "kimap-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "85bde54928e79ff89ba867eae77d6977c2a744be1dc6f808bacfa9af9a4f2074b5cc8c2faeb367d926052d89fffcfc834bf3f751ef8d931bdde835d77a73fbff"

RPROVIDES:${PN} += "cmake-KF5IMAP \
cmake-KPim5IMAP \
kimap-devel"

RDEPENDS:${PN} += "cmake-KF5CoreAddons \
cmake-KPim5Mime \
cyrus-sasl-devel \
libKPim5IMAP5"

inherit rpm
