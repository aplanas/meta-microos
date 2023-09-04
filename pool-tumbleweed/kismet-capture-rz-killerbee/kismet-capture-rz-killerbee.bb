SUMMARY = "Kismet Killerbee Sniffer capture helper"
DESCRIPTION = "Kismet is a wireless network and device detector, sniffer, wardriving \
tool, and WIDS (wireless intrusion detection) framework. \
 \
This subpackage contains the Killerbee Sniffer capture helper."
LICENSE = "GPL-2.0-or-later"

PV = "2023_07_R1"

RPM_NAME = "kismet-capture-rz-killerbee-2023_07_R1-1.1.aarch64.rpm"
RPM_HASH = "11ae8e039d7c6c60663e511cfda6066e2ca55d0da4f770f1a8be191d340ad6cb17978fef94bed9051daa5fef3a8fcdfdda3f3f9beadb94d03718326a6ef340de"

RPROVIDES:${PN} += "kismet-capture-rz-killerbee"

RDEPENDS:${PN} += "kismet \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libprotobuf-c.so.1 \
libusb-1.0.so.0 \
libwebsockets.so.19"

inherit rpm
