SUMMARY = "Library with X keyboard related functions"
DESCRIPTION = "This library allows you to simplify XKB-related development."
LICENSE = "LGPL-2.0-or-later"

PV = "5.4"

RPM_NAME = "libxklavier16-5.4-1.7.aarch64.rpm"
RPM_HASH = "ba2afe421f3107351a9c54ca6fe428a79c6925531dab09f797999aa941552954ef039568a753744304eeb835371cc1b7256e806fce3d0fb8c68884e956316210"

RPROVIDES:${PN} += "libxklavier \
libxklavier.so.16()(64bit) \
libxklavier16 \
libxklavier16(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
iso-codes \
ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libXi.so.6()(64bit) \
libc.so.6()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libxkbfile.so.1()(64bit) \
libxml2.so.2()(64bit)"

inherit rpm
