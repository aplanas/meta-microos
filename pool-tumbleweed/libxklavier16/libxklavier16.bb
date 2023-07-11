SUMMARY = "Library with X keyboard related functions"
DESCRIPTION = "This library allows you to simplify XKB-related development."
LICENSE = "LGPL-2.0-or-later"

PV = "5.4"

RPM_NAME = "libxklavier16-5.4-1.8.aarch64.rpm"
RPM_HASH = "610391c933ce55cdcd7a81264ffbf2cf8059b2a92a03f1ab37978f0a5a7cd9b674ccb09f9aa5d7a57fa51de41c83bf11acdcb526ca7f7040266f9038cbaf73cb"

RPROVIDES:${PN} += "libxklavier \
libxklavier.so.16 \
libxklavier16"

RDEPENDS:${PN} += "/sbin/ldconfig \
iso-codes \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXi.so.6 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libxkbfile.so.1 \
libxml2.so.2"

inherit rpm
