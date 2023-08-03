SUMMARY = "Non-ABI stable API for the Qt 6 Location Library"
DESCRIPTION = "This package provides private headers of libQt6Location that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-location-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "5a501d64aa90517b9a283969edee412a63ef8f8792e677c94f21ce27eab4f4e71265ea08ad08bac8e1d88262fc29b704f59f25528ac93103c9ab9b0ee5935041"

RPROVIDES:${PN} += "qt6-location-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Location"

inherit rpm
