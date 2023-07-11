SUMMARY = "Kismet SDR rtl433 capture helper"
DESCRIPTION = "Kismet is a wireless network and device detector, sniffer, wardriving \
tool, and WIDS (wireless intrusion detection) framework. \
 \
This subpackage contains Kismet SDR rtl433 capture helper. \
https://kismetwireless.net/docs/readme/datasources_sdr_rtl433/"
LICENSE = "GPL-2.0-or-later"

PV = "2022_08_R1"

RPM_NAME = "kismet-capture-sdr-rtl433-2022_08_R1-2.5.aarch64.rpm"
RPM_HASH = "351aa98f0911c2a73ee4fa98b1d9e47d7e868a26bf8bf61098d67e179a093fc2fe04545e312d350501c99c6d749cab15b2f27b0c6f4d59a0c9011c31cb7d321f"

RPROVIDES:${PN} += "kismet-capture-sdr-rtl433 \
python3.11dist-kismetcapturertl433 \
python3dist-kismetcapturertl433"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-protobuf \
python3-websockets \
rtl-433"

inherit rpm
