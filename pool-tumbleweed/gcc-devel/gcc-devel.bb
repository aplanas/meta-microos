SUMMARY = "The system GNU C Compiler Plugin development files"
DESCRIPTION = "The system GNU C Compiler Plugin development files."
LICENSE = "GPL-3.0-or-later"

PV = "13"

RPM_NAME = "gcc-devel-13-1.5.aarch64.rpm"
RPM_HASH = "e39ac1ac801650410bb83d02a5dbe7e0196d5c3f515898b2f64520176d42e9bed393c5821f2d5141c3cb6a50a3c59e863e5477a297f3d60ca2fd13ef8bbc471d"

RPROVIDES:${PN} += "gcc-devel"

RDEPENDS:${PN} += "gcc \
gcc13-devel"

inherit rpm
