SUMMARY = "Tools to access the Windows Shortcut File (LNK) format"
DESCRIPTION = "liblnk is a library to access Windows Shortcut File (LNK) files."
LICENSE = "LGPL-3.0-or-later"

PV = "20230716"

RPM_NAME = "liblnk-tools-20230716-2.1.aarch64.rpm"
RPM_HASH = "087064e158fb5e065b02e778aa5de6387aa074586fc8ef400499d157574d45b7e5f396c6b183f88a458d672a2a088246ac5a8e7dfd7aad9b9e17bd28f87f792e"

RPROVIDES:${PN} += "liblnk-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfdatetime.so.1 \
libfguid.so.1 \
libfwps.so.1 \
libfwsi.so.1 \
liblnk.so.1 \
libuna.so.1"

inherit rpm
