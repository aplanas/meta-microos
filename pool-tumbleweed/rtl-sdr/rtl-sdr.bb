SUMMARY = "Support programs for RTL2832"
DESCRIPTION = "Programs that controls Realtek RTL2832 based DVB dongle in raw mode, so \
it can be used as a SDR receiver."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.0"

RPM_NAME = "rtl-sdr-0.6.0-2.9.aarch64.rpm"
RPM_HASH = "1ebcc7c0cce50c88a3e300f2ede8dde996ddc282ac51a214b7fdfba93de2ea5919b4930f112017e5a197081af27cb3bcd3431e66c17aa433720162dc07065a78"

RPROVIDES:${PN} += "rtl-sdr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
librtlsdr.so.0"

inherit rpm
