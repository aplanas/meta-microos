SUMMARY = "Qt KMSSupport module"
DESCRIPTION = "Qt module to support Kernel Mode Setting."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-kmssupport-devel-static-6.5.1-4.1.aarch64.rpm"
RPM_HASH = "ab9dab8f97128890e79825011b613b5b5db6c303aa1867aeb01ae5b591ba889d4e4bb8a20f26e137988160003e6b11e5b40daf18a05e26e5a602143067df2f8f"

RPROVIDES:${PN} += "cmake-Qt6KmsSupportPrivate \
qt6-kmssupport-devel-static"

RDEPENDS:${PN} += "qt6-core-private-devel \
qt6-gui-private-devel"

inherit rpm
