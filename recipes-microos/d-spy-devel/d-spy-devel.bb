SUMMARY = "Development/header files for d-spy"
DESCRIPTION = "Development/header files for d-spy."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "1.6.0"

RPM_NAME = "d-spy-devel-1.6.0-1.1.aarch64.rpm"
RPM_HASH = "85be425699681d02270f1e72684b2c57100dbecef940fca4f507a4b1735a49c550c84c7b3955db7c4cb6153db56d5b66b90043d6aec51530e2a3f6229a980796"

RPROVIDES:${PN} += "d-spy-devel d-spy-devel(aarch-64) pkgconfig(dspy-1)"
RDEPENDS:${PN} += "/usr/bin/pkg-config d-spy libdspy-1-1 pkgconfig(gio-2.0) pkgconfig(gtk4) pkgconfig(libadwaita-1)"

inherit rpm
