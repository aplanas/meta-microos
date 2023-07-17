SUMMARY = "Command-line tools for Plasma Activity management"
DESCRIPTION = "This package provides command-line tools to manipulate Plasma Activities."
LICENSE = "GPL-2.0-or-later"

PV = "5.108.0"

RPM_NAME = "kactivities5-tools-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "7bd8abf0bbf40d90c0f2a379f1116a7faea0b72c6af3aedf9a37adff9cdaf45d14a47c90b11b649ff2741b9a540a5c3ae40b03bafa5458ca738ba9f04c062363"

RPROVIDES:${PN} += "kactivities5-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5Activities.so.5 \
libKF5Activities5 \
libQt5Core.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
