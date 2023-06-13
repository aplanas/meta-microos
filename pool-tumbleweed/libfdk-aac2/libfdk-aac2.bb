SUMMARY = "Modified Version of the FDK AAC Codec Library for Android"
DESCRIPTION = "The Third-Party Modified Version of the Fraunhofer FDK AAC Codec Library \
for Android is software that implements part of the MPEG Advanced Audio Coding \
('AAC') encoding and decoding scheme for digital audio."
LICENSE = "FDK-AAC"

PV = "2.0.0"

RPM_NAME = "libfdk-aac2-2.0.0-2.7.aarch64.rpm"
RPM_HASH = "bb6eadfe046fd29829ad43bb231267ebaf40cb575fd9691479266818720927912a92d871d52b0bcaaf3ce20385bdd7c3dcba565855f931376c70c19f211dfc1d"

RPROVIDES:${PN} += "libfdk-aac.so.2()(64bit) \
libfdk-aac2 \
libfdk-aac2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
