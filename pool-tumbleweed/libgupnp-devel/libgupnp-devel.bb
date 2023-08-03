SUMMARY = "Implementation of the UPnP specification - Development Files"
DESCRIPTION = "GUPnP implements the UPnP specification: resource announcement and \
discovery, description, control, event notification, and presentation \
(GUPnP includes basic web server functionality through libsoup). GUPnP \
does not include helpers for construction or control of specific \
standardized resources (e.g. MediaServer); this is left for higher level \
libraries utilizing the GUPnP framework."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.4"

RPM_NAME = "libgupnp-devel-1.6.4-2.1.aarch64.rpm"
RPM_HASH = "434fbf04d86312b1878b744665a23e31a08c340a93f6f295fbb6344644b8031a8cb1794217d208066822cb8da7057d86f2ddeef5b4aa8e7af26febf53c76aa3f"

RPROVIDES:${PN} += "libgupnp-devel \
pkgconfig-gupnp-1.6"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/python3 \
libgupnp-1-6-0 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gssdp-1.6 \
pkgconfig-libsoup-3.0 \
pkgconfig-libxml-2.0 \
typelib-1-0-GUPnP-1-0"

inherit rpm
