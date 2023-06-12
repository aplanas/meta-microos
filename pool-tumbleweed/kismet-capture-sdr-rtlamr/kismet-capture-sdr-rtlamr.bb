SUMMARY = "Kismet SDR rtlamr capture helper"
DESCRIPTION = "Kismet is a wireless network and device detector, sniffer, wardriving \
tool, and WIDS (wireless intrusion detection) framework. \
 \
This subpackage contains Kismet SDR rtlamr capture helper. \
https://kismetwireless.net/docs/readme/datasources_sdr_rtlamr/"
LICENSE = "GPL-2.0-or-later"

PV = "2022_08_R1"

RPM_NAME = "kismet-capture-sdr-rtlamr-2022_08_R1-2.3.aarch64.rpm"
RPM_HASH = "206e32187258d90dc09e6c4eea15f8b736c9072a4aa788b05a40b2940c6e2cb0a0d220fd62ce118ad08bbe36f23e7e3a893712925667eb6b1382558794f21601"

RPROVIDES:${PN} += "kismet-capture-sdr-rtlamr \
kismet-capture-sdr-rtlamr(aarch-64) \
python3.10dist(kismetcapturertlamr) \
python3dist(kismetcapturertlamr)"
RDEPENDS:${PN} += "/usr/bin/python3 \
python(abi) \
python3-numpy \
python3-protobuf \
python3-websockets"

inherit rpm
