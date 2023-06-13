SUMMARY = "Development files for libgnomesu"
DESCRIPTION = "This package contains all files needed to develop with libgnomesu."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.7"

RPM_NAME = "libgnomesu-devel-2.0.7-2.3.aarch64.rpm"
RPM_HASH = "338c989298c9022ac1a8c27e89e7d4b38845cd6ec744a8881c9d7321d6e2b08c7fab44a0e09e817852b7c242f1c3d07c92039951b92ddf0e53a50b95abd75eca"

RPROVIDES:${PN} += "libgnomesu-devel \
libgnomesu-devel(aarch-64) \
pkgconfig(libgnomesu-1.0)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgnomesu \
libgnomesu0 \
pkgconfig(glib-2.0)"

inherit rpm
