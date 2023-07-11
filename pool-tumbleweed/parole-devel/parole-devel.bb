SUMMARY = "Development Files for Parole"
DESCRIPTION = "This package contains development files for developing plugins for parole."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.0"

RPM_NAME = "parole-devel-4.18.0-1.4.aarch64.rpm"
RPM_HASH = "a6c4dd9cdeda20837612982ddf37c2054796c0a3320964c4cd9ec6563b789f9ad0cd28c1e0d82ac21e85e7e765599dfdd16a48900f15c3b791084e4c4a52e512"

RPROVIDES:${PN} += "parole-devel"

RDEPENDS:${PN} += "parole \
pkgconfig-glib-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-libxfce4util-1.0"

inherit rpm
