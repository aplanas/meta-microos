SUMMARY = "Caja terminal plugin"
DESCRIPTION = "This extension allows to open a Terminal in arbitrary directories \
through Caja file manager."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "caja-extension-open-terminal-1.26.1-2.3.aarch64.rpm"
RPM_HASH = "4ec1683b3075bb412b174522ae69e96bcb4ce03c10603afcb756501d60088f0d11e656e29ce8f22cb675e27c401de177bf26053529f4cee699341bb049543cfe"

RPROVIDES:${PN} += "caja-extension-open-terminal caja-extension-open-terminal(aarch-64) caja-open-terminal libcaja-open-terminal.so()(64bit) mate-file-manager-open-terminal"
RDEPENDS:${PN} += "caja ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcaja-extension.so.1()(64bit) libgdk-3.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libmate-desktop-2.so.17()(64bit)"

inherit rpm
