SUMMARY = "Kismet SDR rtlamr capture helper"
DESCRIPTION = "Kismet is a wireless network and device detector, sniffer, wardriving \
tool, and WIDS (wireless intrusion detection) framework. \
 \
This subpackage contains Kismet SDR rtlamr capture helper. \
https://kismetwireless.net/docs/readme/datasources_sdr_rtlamr/"
LICENSE = "GPL-2.0-or-later"

PV = "2022_08_R1"

RPM_NAME = "kismet-capture-sdr-rtlamr-2022_08_R1-2.5.aarch64.rpm"
RPM_HASH = "3974006a5e34543dbf391e9108f00fa2ef8c6ac0f5cefa331acbe13af5fa8eec160b89c0fc240cd1ef1bb5a5df8294bf5a63747fdde2ecef6b0bd7c0f2bcfba3"

RPROVIDES:${PN} += "kismet-capture-sdr-rtlamr \
python3.11dist-kismetcapturertlamr \
python3dist-kismetcapturertlamr"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-numpy \
python3-protobuf \
python3-websockets"

inherit rpm
