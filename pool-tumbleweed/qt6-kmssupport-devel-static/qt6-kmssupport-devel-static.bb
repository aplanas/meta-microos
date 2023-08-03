SUMMARY = "Qt KMSSupport module"
DESCRIPTION = "Qt module to support Kernel Mode Setting."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-kmssupport-devel-static-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "eefd928feabccf986177b5ba43a24b204d37e108bcb4d8ac3c70f3b0982b45ef4f021d5a300e13a6f1e78af3bc342ce59e6002900a1043a475004aec8efc722f"

RPROVIDES:${PN} += "cmake-Qt6KmsSupportPrivate \
qt6-kmssupport-devel-static"

RDEPENDS:${PN} += "qt6-core-private-devel \
qt6-gui-private-devel"

inherit rpm
