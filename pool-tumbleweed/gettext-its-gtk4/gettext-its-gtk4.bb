SUMMARY = "International Tag Set for GTK+ 4"
DESCRIPTION = "This package enhances gettext with an International Tag Set for GTK+ 4"
LICENSE = "LGPL-2.1-or-later"

PV = "4.12.0"

RPM_NAME = "gettext-its-gtk4-4.12.0-2.1.aarch64.rpm"
RPM_HASH = "aa71a19880d08b0a4f1673d97e6f56984340cd6eef4f716cebba98ed0f3f58ebcd1d5ee4ec4a4a8b5c94795018ca1cdb2e6f0ffb8bb769907233130639211baa"

RPROVIDES:${PN} += "gettext-its-gtk3 \
gettext-its-gtk4"

RDEPENDS:${PN} += ""

inherit rpm
