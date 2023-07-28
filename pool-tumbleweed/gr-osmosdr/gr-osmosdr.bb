SUMMARY = "Gnuradio Source for OsmoSDR"
DESCRIPTION = "OsmoSDR Gnuradio Source supports the OsmoSDR hardware, but it also offers a \
wrapper functionality for FunCube Dongle, Ettus UHD and rtl-sdr radios."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.4"

RPM_NAME = "gr-osmosdr-0.2.4-1.3.aarch64.rpm"
RPM_HASH = "e01bd5bdad9e2bd12a59b38cab34925c2ba9a34602df34352a18d18157f1c9cc34bb9986304244a950531a4da5867e505b01a03361b205cdcf10ae346024db6b"

RPROVIDES:${PN} += "gr-osmosdr"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3-gr-osmosdr"

inherit rpm
