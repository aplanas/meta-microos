SUMMARY = "Development files for Airspy HF+"
DESCRIPTION = "Library headers for Airspy HF+ driver."
LICENSE = "BSD-3-Clause"

PV = "1.6.8"

RPM_NAME = "airspyhf-devel-1.6.8-1.13.aarch64.rpm"
RPM_HASH = "dca08fdbf63f881747edfadbf7033b833a2bbe624fa9ad573f706eadc63d58ade7e27305f0137c6333fbc67f34d6b375765627364a96c276f27042489320be13"

RPROVIDES:${PN} += "airspyhf-devel \
pkgconfig-libairspyhf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libairspyhf0"

inherit rpm
