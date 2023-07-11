SUMMARY = "Python bindings for gr-osmosdr"
DESCRIPTION = "Python Bindings for gr-osmosdr. \
OsmoSDR Gnuradio Source supports the OsmoSDR hardware, but it also offers a \
wrapper functionality for FunCube Dongle, Ettus UHD and rtl-sdr radios."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.4"

RPM_NAME = "python3-gr-osmosdr-0.2.4-1.2.aarch64.rpm"
RPM_HASH = "99a2b6f8ed1d44871be4ce733ec20b6eff16607aefee85baf7e176c979e53e4d5518579a637f110779392f9215137a15bf95e15c9de758ca36f189c5db47eee2"

RPROVIDES:${PN} += "python3-gr-osmosdr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgnuradio-osmosdr.so.0.2.0 \
libgnuradio-runtime.so.3.10.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
