SUMMARY = "Support programs for Airspy HF+ SDR"
DESCRIPTION = "Host software for Airspy HF+, a software defined radio \
for the HF and VHF bands."
LICENSE = "BSD-3-Clause"

PV = "1.6.8"

RPM_NAME = "airspyhf-1.6.8-1.13.aarch64.rpm"
RPM_HASH = "a9d14755c4d29654cac815bda1096fc951e28c5995b8c16214104c75764c62ceebf0c0a38e052b8449460c579e99a94a7659ea1d943eb0b6107335dd9f9a64b5"

RPROVIDES:${PN} += "airspyhf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libairspyhf.so.0 \
libc.so.6"

inherit rpm
