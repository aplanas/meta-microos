SUMMARY = "Development files for libsubtitleeditor"
DESCRIPTION = "The libsubtitleeditor-devel package contains libraries and header files for \
developing applications that use libsubtitleeditor0."
LICENSE = "GPL-3.0"

PV = "0.54.0"

RPM_NAME = "libsubtitleeditor-devel-0.54.0-4.17.aarch64.rpm"
RPM_HASH = "b7fbe10491db928b2c869099ae974a835b81237d226b8865f198128bd7bd1aaa2b66c6231350a2403e5a740c3af7914bab99e52230899849d3b7618b3d06d2ed"

RPROVIDES:${PN} += "libsubtitleeditor-devel"

RDEPENDS:${PN} += "libsubtitleeditor0"

inherit rpm
