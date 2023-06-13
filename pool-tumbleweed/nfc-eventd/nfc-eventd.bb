SUMMARY = "NFC event daemon"
DESCRIPTION = "nfc-eventd is a daemon that looks for tags insertions/removes from \
NFC device. It is provided with two NEM (Nfc Eventd Modules) which \
allow many kind of usage of theses events."
LICENSE = "GPL-3.0+"

PV = "0.1.7"

RPM_NAME = "nfc-eventd-0.1.7-5.28.aarch64.rpm"
RPM_HASH = "64af516b2f8c97f374ff1b5810dd20a7dc2454ca42b0e94bbd60ea2064dbee753a07c99aedd994d8a04a0553db6064f8e81f86112701074d27f56a02a49cc189"

RPROVIDES:${PN} += "config(nfc-eventd) \
nfc-eventd \
nfc-eventd(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libnfc.so.6()(64bit)"

inherit rpm
