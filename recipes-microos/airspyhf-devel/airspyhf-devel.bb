SUMMARY = "Development files for Airspy HF+"
DESCRIPTION = "Library headers for Airspy HF+ driver."
LICENSE = "BSD-3-Clause"

PV = "1.6.8"

RPM_NAME = "airspyhf-devel-1.6.8-1.12.aarch64.rpm"
RPM_HASH = "08d5293bb55a5a77cd908b9dcfbaff247d7fd9600c137f389b90e1099be1b20bf393311418ce438c6e399cd7ae9ea0925b3129959306e839c67a6275c6ae2e9e"

RPROVIDES:${PN} += "airspyhf-devel airspyhf-devel(aarch-64) pkgconfig(libairspyhf)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libairspyhf0"

inherit rpm
