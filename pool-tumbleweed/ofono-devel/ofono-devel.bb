SUMMARY = "Development files for ofono, a mobile telephony framework"
DESCRIPTION = "oFono provides a mobile telephony (GSM/UMTS) application development \
framework. It includes a high-level D-Bus API for use by telephony \
applications, and a low-level plug-in API. \
 \
This subpackage contains the header files for developing \
applications that want to make use of ofono."
LICENSE = "GPL-2.0-only"

PV = "1.34"

RPM_NAME = "ofono-devel-1.34-1.8.aarch64.rpm"
RPM_HASH = "22e3e235bd9c927276a525aba8f5f259788fe613893a3b716d88d01667a5f6af2a4603c9ff6962e44ae504d2dbfdad6ced310776a3237309485a327a4c8d83a7"

RPROVIDES:${PN} += "ofono-devel \
pkgconfig-ofono"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ofono \
pkgconfig-dbus-1 \
pkgconfig-glib-2.0"

inherit rpm
