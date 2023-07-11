SUMMARY = "Allow session software to update device firmware"
DESCRIPTION = "fwupd is a daemon to allows session software to update device firmware on \
the local machine."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.8.16"

RPM_NAME = "fwupd-devel-1.8.16-2.1.aarch64.rpm"
RPM_HASH = "bf1fe3fba17739553114da54e1854a3a794f106073e336ca3bdee95871927603a41aa9b020ee0eb394101b0b93201c104af807b260b0b20daec6f3ec26bfea60"

RPROVIDES:${PN} += "fwupd-devel \
pkgconfig-fwupd"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
fwupd \
libfwupd2 \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-gmodule-2.0 \
pkgconfig-jcat \
pkgconfig-json-glib-1.0 \
pkgconfig-libcurl \
typelib-1-0-Fwupd-2-0"

inherit rpm
