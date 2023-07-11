SUMMARY = "Equinox Metathemes for GTK+"
DESCRIPTION = "This package provides a set of elegant GTK+ themes that use the Equinox \
engine."
LICENSE = "GPL-2.0+"

PV = "1.50"

RPM_NAME = "gtk2-metatheme-equinox-1.50-10.29.aarch64.rpm"
RPM_HASH = "802cc7bc9ff17b0b51faf3a5d1e0cb18909f64f5d4d31183df5fb262a12cbbafe1925759d980f3202b7b5c69e07e32d87e84ea529899117506107b493ce087a3"

RPROVIDES:${PN} += "gtk2-metatheme-equinox"

RDEPENDS:${PN} += "dmz-icon-theme-cursors \
faenza-icon-theme \
gtk2-engine-equinox"

inherit rpm
