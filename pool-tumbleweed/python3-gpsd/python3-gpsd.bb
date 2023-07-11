SUMMARY = "Client libraries in C and Python3 for talking to a running gpsd or GPS"
DESCRIPTION = "This package provides python3 modules and tools for the gpsd shared libraries. \
You will need to have gpsd installed for it to work."
LICENSE = "BSD-3-Clause"

PV = "3.25"

RPM_NAME = "python3-gpsd-3.25-1.4.aarch64.rpm"
RPM_HASH = "d6d09cbd492db95191f04ee9f19cb3f5d4d733ff41d2b1bd4a0364b3eed3e9e06ae347423b50c07b3c015a75f7afbd07812a124647fa5de715535569eec81e4c"

RPROVIDES:${PN} += "python3-gpsd \
python3.11dist-gps \
python3dist-gps"

RDEPENDS:${PN} += "/usr/bin/python3 \
gpsd \
python-abi"

inherit rpm
