SUMMARY = "Tools to access the Windows Shortcut File (LNK) format"
DESCRIPTION = "liblnk is a library to access Windows Shortcut File (LNK) files."
LICENSE = "LGPL-3.0-or-later"

PV = "20230205"

RPM_NAME = "liblnk-tools-20230205-1.4.aarch64.rpm"
RPM_HASH = "c4414b9fedaf5ca33793b7c9b31d947c1746161dac4bbcf0877b11f944009584c6b6ae249fa431cea4692ee52a80ff91b0dea1378d1ee6656c0c1a71309c7811"

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
liblnk.so.1"

inherit rpm
