SUMMARY = "Client libraries in C and Python3 for talking to a running gpsd or GPS"
DESCRIPTION = "This package provides python3 modules and tools for the gpsd shared libraries. \
You will need to have gpsd installed for it to work."
LICENSE = "BSD-3-Clause"

PV = "3.25"

RPM_NAME = "python3-gpsd-3.25-1.3.aarch64.rpm"
RPM_HASH = "193bf0c8ed3129367353e8e54376eb67286d91298e85a0f974c280b2535b37a1c5d0fe97a3b13c1f8d3449c0f8695b71c9c5c907c7f31277386589c30e1c8a14"

RPROVIDES:${PN} += "python3-gpsd \
python3-gpsd(aarch-64) \
python3.10dist(gps) \
python3dist(gps)"

RDEPENDS:${PN} += "/usr/bin/python3 \
gpsd \
python(abi)"

inherit rpm
