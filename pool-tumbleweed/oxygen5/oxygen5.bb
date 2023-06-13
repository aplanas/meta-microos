SUMMARY = "Oxygen style, KWin decoration and cursors"
DESCRIPTION = "Provides Oxygen style, KWin decoration, and cursors."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "oxygen5-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "ab16266a3690cf87ec7cd2229c91ab7c8a15ef5cb7b59b1ae6c73df2105e6af6a13e56e8463957e9c96106636b69e7f9c66a6f24504834f553949d3d4f93748c"

RPROVIDES:${PN} += "oxygen5 \
oxygen5(aarch-64)"

RDEPENDS:${PN} += "oxygen5-decoration \
oxygen5-style"

inherit rpm
