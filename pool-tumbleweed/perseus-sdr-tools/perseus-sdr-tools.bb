SUMMARY = "Tools for Perseus SDR"
DESCRIPTION = "Tools for Perseus SDR devices."
LICENSE = "GPL-3.0-only"

PV = "0.8.1"

RPM_NAME = "perseus-sdr-tools-0.8.1-1.23.aarch64.rpm"
RPM_HASH = "acbfa3fd1d28fbcb848759c004746e3d3f8fe235e5319e990974ac39c4716ffd3ae2cf2ca2bd4d2a39cc88d057483cfa80ad442e35e626f95e0ac67fc7d7dda7"

RPROVIDES:${PN} += "perseus-sdr-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libperseus-sdr.so.0 \
libusb-1.0.so.0"

inherit rpm
