SUMMARY = "Python ALSA binding"
DESCRIPTION = "This package provides the Python binding to ALSA."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "1.2.7"

RPM_NAME = "python311-alsa-1.2.7-2.4.aarch64.rpm"
RPM_HASH = "0bc45606f5e5f449d011b6654939367fa10f9d3faa0f27649c3d6bafbc47f0a5a4fd8cf85bedff4bb570f514a130b209735a96b97407f663ff71cb2cd070b1c4"

RPROVIDES:${PN} += "pyalsa \
python3.11dist(pyalsa) \
python311-alsa \
python311-alsa(aarch-64) \
python3dist(pyalsa)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libasound.so.2(ALSA_0.9.3)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi)"

inherit rpm
