SUMMARY = "The settings Daemon for the Cinnamon Desktop -- Development Files"
DESCRIPTION = "This package contains the settings Daemon for the Cinnamon Desktop. \
 \
This package contains development files for cinnamon-settings-daemon."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only"

PV = "5.2.0"

RPM_NAME = "cinnamon-settings-daemon-devel-5.2.0-2.7.aarch64.rpm"
RPM_HASH = "b675ce1786cfe9cb934ed588a25f16426acb2f632ae0c542e010804a23f5cbe3a8dfb1a3652a2c7782e74d08375bd9cc5894b68822c001f4f4b30c2fa99d873e"

RPROVIDES:${PN} += "cinnamon-settings-daemon-devel cinnamon-settings-daemon-devel(aarch-64) pkgconfig(cinnamon-settings-daemon)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cinnamon-settings-daemon pkgconfig(glib-2.0)"

inherit rpm
