SUMMARY = "Minimalistic terminal program"
DESCRIPTION = "microcom is a minimalistic terminal program for communicating with devices over \
a serial connection (e.g. embedded systems, switches, modems). It features \
connection via RS232 serial interfaces (including setting of transfer rates) as \
well as in 'Telnet mode' as specified in [RFC 2217]. \
 \
[RFC 2217]: https://tools.ietf.org/html/rfc2217"
LICENSE = "GPL-2.0-only"

PV = "2019.01.0.11"

RPM_NAME = "microcom-2019.01.0.11-1.2.aarch64.rpm"
RPM_HASH = "ba15c0d0ad80ac06e736c0fa99621914c4c78a2b2dad83a28424176746f72fe7f5afe5b61e0caf1ca9a825f035727d3b5b481611c12e8af184af7881eae67820"

RPROVIDES:${PN} += "microcom \
microcom(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libreadline.so.8()(64bit)"

inherit rpm
