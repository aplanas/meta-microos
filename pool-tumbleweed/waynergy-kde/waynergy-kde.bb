SUMMARY = "KDE desktop integration"
DESCRIPTION = "An implementation of a synergy client for wayland compositors. Based \
on the upstream uSynergy library (heavily modified for more protocol \
support and a bit of paranoia). \
 \
Contains waynergy.desktop must be installed, and the path must be \
absolute or the required interface will not be offered."
LICENSE = "MIT"

PV = "0.16+3"

RPM_NAME = "waynergy-kde-0.16+3-1.1.noarch.rpm"
RPM_HASH = "72753f1ff86722e377ca833a2ca0824813b829da7908393f1f8ec75b5860f8b5c12b650e88d8e8cef7a77c8f468d2ee4083e1392edc2cdb62133a5b742ae2a8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "waynergy-kde"

RDEPENDS:${PN} += "waynergy"

inherit rpm
