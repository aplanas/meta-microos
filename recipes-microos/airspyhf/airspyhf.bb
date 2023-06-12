SUMMARY = "Support programs for Airspy HF+ SDR"
DESCRIPTION = "Host software for Airspy HF+, a software defined radio \
for the HF and VHF bands."
LICENSE = "BSD-3-Clause"

PV = "1.6.8"

RPM_NAME = "airspyhf-1.6.8-1.12.aarch64.rpm"
RPM_HASH = "2cd0417bb4343cd7e26e3c30703ee46ed21d7b9a0eebd730a6bdc324fb783151619beaa040a3b6825bd99e82403883e2937c29d1151ef1d20cef93dcc58b94a3"

RPROVIDES:${PN} += "airspyhf \
airspyhf(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libairspyhf.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
