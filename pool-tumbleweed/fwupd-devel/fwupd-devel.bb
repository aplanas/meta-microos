SUMMARY = "Allow session software to update device firmware"
DESCRIPTION = "fwupd is a daemon to allows session software to update device firmware on \
the local machine."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.8.12"

RPM_NAME = "fwupd-devel-1.8.12-1.3.aarch64.rpm"
RPM_HASH = "9f8bace04a9c776d345f9c021d6826ce73e53b4fd591af2a3641cc519a467fa0c1ce40d3e68f5e30409d3beb2c2857fdd9b5a34271fe2c28c2ba7e9cf9c6cfe3"

RPROVIDES:${PN} += "fwupd-devel \
fwupd-devel(aarch-64) \
pkgconfig(fwupd)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
fwupd \
libfwupd2 \
pkgconfig(gio-2.0) \
pkgconfig(gio-unix-2.0) \
pkgconfig(gmodule-2.0) \
pkgconfig(jcat) \
pkgconfig(json-glib-1.0) \
pkgconfig(libcurl) \
typelib-1_0-Fwupd-2_0"

inherit rpm
