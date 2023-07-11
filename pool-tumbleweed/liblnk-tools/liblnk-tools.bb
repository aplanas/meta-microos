SUMMARY = "Tools to access the Windows Shortcut File (LNK) format"
DESCRIPTION = "liblnk is a library to access Windows Shortcut File (LNK) files."
LICENSE = "LGPL-3.0-or-later"

PV = "20230205"

RPM_NAME = "liblnk-tools-20230205-1.7.aarch64.rpm"
RPM_HASH = "6aaa80307d4b8d46de3c7d53a9996cef08d2e237888292b7855411fe9a091fb04acde1588636d5e98f37606f09e4135f101122072bce420c440ec327d850d119"

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
