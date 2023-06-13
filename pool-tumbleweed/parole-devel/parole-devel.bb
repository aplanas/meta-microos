SUMMARY = "Development Files for Parole"
DESCRIPTION = "This package contains development files for developing plugins for parole."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.0"

RPM_NAME = "parole-devel-4.18.0-1.3.aarch64.rpm"
RPM_HASH = "7c336cec9765c17737b13bc1bde3ac5de5e9b59426ddf22cbc125427c935bb81bbcf2ec9f1e39b5c2e9ce3f715238ad0f1ea7733fd4f5198bfe6bef14a351af1"

RPROVIDES:${PN} += "parole-devel \
parole-devel(aarch-64)"

RDEPENDS:${PN} += "parole \
pkgconfig(glib-2.0) \
pkgconfig(gtk+-3.0) \
pkgconfig(libxfce4util-1.0)"

inherit rpm
