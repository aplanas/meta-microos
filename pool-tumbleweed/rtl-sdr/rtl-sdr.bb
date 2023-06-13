SUMMARY = "Support programs for RTL2832"
DESCRIPTION = "Programs that controls Realtek RTL2832 based DVB dongle in raw mode, so \
it can be used as a SDR receiver."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.0"

RPM_NAME = "rtl-sdr-0.6.0-2.8.aarch64.rpm"
RPM_HASH = "e643d9ad08f278bf7fdc5dbcc64ccf7e9fbbf2bc8ac3250d14b5a647535bca39e22dbaa6294343326f9afc1ae44865651dfed1c84b8315f014227ebb358d192e"

RPROVIDES:${PN} += "rtl-sdr \
rtl-sdr(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
librtlsdr.so.0()(64bit)"

inherit rpm
