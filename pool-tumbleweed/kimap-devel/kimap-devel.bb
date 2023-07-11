SUMMARY = "KDE PIM Libraries: Build Environment"
DESCRIPTION = "This package contains development headers to add IMAP support to PIM \
applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "kimap-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "09da6b2bcdd9efcf366e65eea135b04da68583e6aac461fb55c6b99c1e7f30262f9a6741846d6129eebf55ca7f88f6beacaf0dd268d85d30735922bc93f258a3"

RPROVIDES:${PN} += "cmake-KF5IMAP \
cmake-KPim5IMAP \
kimap-devel"

RDEPENDS:${PN} += "cmake-KF5CoreAddons \
cmake-KPim5Mime \
cyrus-sasl-devel \
libKPim5IMAP5"

inherit rpm
