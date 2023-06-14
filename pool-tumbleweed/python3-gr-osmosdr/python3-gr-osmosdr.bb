SUMMARY = "Python bindings for gr-osmosdr"
DESCRIPTION = "Python Bindings for gr-osmosdr. \
OsmoSDR Gnuradio Source supports the OsmoSDR hardware, but it also offers a \
wrapper functionality for FunCube Dongle, Ettus UHD and rtl-sdr radios."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.4"

RPM_NAME = "python3-gr-osmosdr-0.2.4-1.1.aarch64.rpm"
RPM_HASH = "e7a4b4ec3c250264b8affb309ecea64c7dff47c13b77331bc98e2ffb4cce51df2337ebad241ea6864212ef28857eba07b15cd868934322de5bb849bc1c079379"

RPROVIDES:${PN} += "python3-gr-osmosdr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgnuradio-osmosdr.so.0.2.0 \
libgnuradio-runtime.so.3.10.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
