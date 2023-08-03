SUMMARY = "Allow session software to update device firmware"
DESCRIPTION = "fwupd is a daemon to allows session software to update device firmware on \
the local machine."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.8.17"

RPM_NAME = "fwupd-devel-1.8.17-1.1.aarch64.rpm"
RPM_HASH = "bbae3e0ad3ee121b15e9aee107847c900f8df67db4415128c408e9307eaf4e46f9e6b3e6aa9476e7ed8f54f2c6acb125b61cff771dac27600c61b73e5da23204"

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
