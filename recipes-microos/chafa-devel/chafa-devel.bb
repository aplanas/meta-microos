SUMMARY = "Development files for chafa"
DESCRIPTION = "Development files for chafa."
LICENSE = "LGPL-3.0-or-later"

PV = "1.12.4"

RPM_NAME = "chafa-devel-1.12.4-1.3.aarch64.rpm"
RPM_HASH = "db3a16e0a31dc489230b5b8b7fb5ca3a5a92209c50af036d6dee9029f8f3e675bdc9fef6fa7468a5109e2136af6734de690048d42f11849acbd25970d21abdb9"

RPROVIDES:${PN} += "chafa-devel chafa-devel(aarch-64) pkgconfig(chafa)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libchafa0 pkgconfig(glib-2.0)"

inherit rpm
