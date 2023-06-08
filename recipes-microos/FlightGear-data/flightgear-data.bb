SUMMARY = "FlightGear base scenery and data files"
DESCRIPTION = "This package contains the base scenery and aircraft for FlightGear. \
It must be installed together with the FlightGear flight simulator package."
LICENSE = "GPL-2.0-only"

PV = "2020.3.18"

RPM_NAME = "FlightGear-data-2020.3.18-1.1.noarch.rpm"
RPM_HASH = "b625c7dae7a681dab6c87b0901d2a5f4d5640c94500913df8ebe45754cfe345e2f29ce42c67bb1ef9ede31bc61815926d7d93e2d07a7f9398a7acac16b2aab5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "FlightGear-data"
RDEPENDS:${PN} += "liberation-fonts"

inherit rpm
