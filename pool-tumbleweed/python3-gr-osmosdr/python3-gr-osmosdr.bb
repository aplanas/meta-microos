SUMMARY = "Python bindings for gr-osmosdr"
DESCRIPTION = "Python Bindings for gr-osmosdr. \
OsmoSDR Gnuradio Source supports the OsmoSDR hardware, but it also offers a \
wrapper functionality for FunCube Dongle, Ettus UHD and rtl-sdr radios."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.4"

RPM_NAME = "python3-gr-osmosdr-0.2.4-1.3.aarch64.rpm"
RPM_HASH = "8aa057a75795719d5a56dad8adbc8b4a2b392859fb2ed7cf63129c05e401bf6fe81618e626549a718d74c1aafe7952522dd5f72fa59ff5e6b117b4ce55ed3640"

RPROVIDES:${PN} += "python3-gr-osmosdr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgnuradio-osmosdr.so.0.2.0 \
libgnuradio-runtime.so.3.10.7 \
libstdc++.so.6 \
python-abi"

inherit rpm
