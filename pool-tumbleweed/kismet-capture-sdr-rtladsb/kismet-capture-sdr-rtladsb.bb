SUMMARY = "Kismet SDR rtladsb capture helper"
DESCRIPTION = "Kismet is a wireless network and device detector, sniffer, wardriving \
tool, and WIDS (wireless intrusion detection) framework. \
 \
This subpackage contains the SDR rtladsb capture helper. \
https://kismetwireless.net/docs/readme/datasources_sdr_rtladsb/"
LICENSE = "GPL-2.0-or-later"

PV = "2023_07_R1"

RPM_NAME = "kismet-capture-sdr-rtladsb-2023_07_R1-1.1.noarch.rpm"
RPM_HASH = "25dea48337c76d212edc70c0e41588cfaa390b94be7e8670b58b55fb863778bcbc94341357d93c1d096f816a3d1a3adbb4da5b0921f74e47c3baf03fe4f2f755"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kismet-capture-sdr-rtladsb \
python3.11dist-kismetcapturertladsb \
python3dist-kismetcapturertladsb"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-numpy \
python3-protobuf \
python3-websockets \
rtl-sdr"

inherit rpm
