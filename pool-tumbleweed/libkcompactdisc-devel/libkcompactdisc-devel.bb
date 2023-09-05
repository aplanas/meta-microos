SUMMARY = "Development files for the KDE CD drive library"
DESCRIPTION = "This package contains the development headers for libkcompactdisc."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "libkcompactdisc-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "c7bd556d9106fc2e03146dad659c67475c66c4bae167faacac6bf63b751b1db9e7ad44cf3ca28aaf0be41b6a7ad985984d48d78ba012f1b4f0ee0dd3ae22954a"

RPROVIDES:${PN} += "cmake-KF5CompactDisc \
libkcompactdisc-devel"

RDEPENDS:${PN} += "libKF5CompactDisc5"

inherit rpm
