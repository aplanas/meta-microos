SUMMARY = "Development package for irssi"
DESCRIPTION = "This package contains the development files for irssi. It allows to \
compile plugins for the irssi package."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.4"

RPM_NAME = "irssi-devel-1.4.4-2.1.aarch64.rpm"
RPM_HASH = "1e68c68c498d8119bb158aeab4e4ca66d4eb87569b9c47dc92e22f841beb3a6f4e4e03fd79a1d2130e334325a9d7021d80a8a534c2848c55b19934da6ec57bef"

RPROVIDES:${PN} += "irssi-devel \
irssi-devel(aarch-64) \
pkgconfig(irssi-1)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
dante-devel \
irssi \
pkgconfig(glib-2.0)"

inherit rpm
