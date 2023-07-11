SUMMARY = "Modified Version of the FDK AAC Codec Library for Android"
DESCRIPTION = "The Third-Party Modified Version of the Fraunhofer FDK AAC Codec Library \
for Android is software that implements part of the MPEG Advanced Audio Coding \
('AAC') encoding and decoding scheme for digital audio."
LICENSE = "FDK-AAC"

PV = "2.0.0"

RPM_NAME = "libfdk-aac2-2.0.0-2.8.aarch64.rpm"
RPM_HASH = "d5d75a4bfe53bef62ca41fec73ed687244975360f722575dc24731d266767ecdb17e7caf1ea5cee1ecada155dd58e97ea25980ed595a1d090ec10e07306436a9"

RPROVIDES:${PN} += "libfdk-aac.so.2 \
libfdk-aac2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
