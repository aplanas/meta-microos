SUMMARY = "Utilities to assist with bfio file overlays"
DESCRIPTION = "This subpackage provides the utilities from libbfoverlay."
LICENSE = "LGPL-3.0-or-later"

PV = "20210416"

RPM_NAME = "libbfoverlay-tools-20210416-3.3.aarch64.rpm"
RPM_HASH = "c192c76e795fd95635733cec692ac92eeead2224813173e81ae0ef0cc71dde38e3cc98252de45d6c88e7734a5db33be1df6dc39660dbff1a90409e828008f471"

RPROVIDES:${PN} += "libbfoverlay-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfoverlay.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfuse.so.2"

inherit rpm
