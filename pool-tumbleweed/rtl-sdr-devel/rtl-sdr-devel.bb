SUMMARY = "Development files for rtl-sdr"
DESCRIPTION = "Library headers for rtl-sdr driver."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.0"

RPM_NAME = "rtl-sdr-devel-0.6.0-2.9.aarch64.rpm"
RPM_HASH = "06c18a610d96ee4a1c2bb09360804365bd7e5a4e335d20cdda2921e136931ee2a00b8d2c747316f96c5f9722bc78ed4075324f28c2761732c3b778d8399feffe"

RPROVIDES:${PN} += "cmake-rtlsdr \
pkgconfig-librtlsdr \
rtl-sdr-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
rtl-sdr"

inherit rpm
