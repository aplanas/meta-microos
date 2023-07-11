SUMMARY = "Library for KDE Education Applications: Build Environment"
DESCRIPTION = "This package contains all necessary files and libraries needed to \
develop KDE education applications."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "libkeduvocdocument-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "1311a0157d3314b791176d75dc5ac61dfdd642e3e96829376033bf64c5c32fd0d82464d4cda3e2b20351526e4e8456fd8959cd816f617699c5656033cfedae06"

RPROVIDES:${PN} += "cmake-LibKEduVocDocument \
libkeduvocdocument-devel"

RDEPENDS:${PN} += "libKEduVocDocument5"

inherit rpm
