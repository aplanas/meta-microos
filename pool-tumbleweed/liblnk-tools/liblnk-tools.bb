SUMMARY = "Tools to access the Windows Shortcut File (LNK) format"
DESCRIPTION = "liblnk is a library to access Windows Shortcut File (LNK) files."
LICENSE = "LGPL-3.0-or-later"

PV = "20230716"

RPM_NAME = "liblnk-tools-20230716-1.1.aarch64.rpm"
RPM_HASH = "d3489e9e0c6660dc0207f9bd5ba55fc4acd7b1cb8a1d3e0910995ef9337d3812c8ea03dcaec66a7345b38a90ffc3da361c9806911f0ee17f1fedb46a6cf23348"

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
