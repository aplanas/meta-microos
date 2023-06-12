SUMMARY = "The system GNU Objective C++ Compiler"
DESCRIPTION = "The system GNU Objective C++ Compiler."
LICENSE = "GPL-3.0-or-later"

PV = "13"

RPM_NAME = "gcc-obj-c++-13-1.3.aarch64.rpm"
RPM_HASH = "efd4b7166dbdcaddeba52b6cb9de74f35960d490fde240669585b42bbc3b61cace5424babe2441df8db520907698bf602f8ea85b8a738c0e98c336186d5da18c"

RPROVIDES:${PN} += "gcc-obj-c++ \
gcc-obj-c++(aarch-64)"
RDEPENDS:${PN} += "gcc-objc \
gcc13-obj-c++"

inherit rpm
