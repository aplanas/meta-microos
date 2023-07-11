SUMMARY = "Utilities to assist with bfio file overlays"
DESCRIPTION = "This subpackage provides the utilities from libbfoverlay."
LICENSE = "LGPL-3.0-or-later"

PV = "20210416"

RPM_NAME = "libbfoverlay-tools-20210416-3.4.aarch64.rpm"
RPM_HASH = "68a36ee0ff7164712bb7e0e0fefef12c06bc5a36faf6b1eab450e162fa707549e2136642f32ea28702cc46a7f963a72c7ed3f00526b3168dad733a464b224d2a"

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
