SUMMARY = "Minimalistic terminal program"
DESCRIPTION = "microcom is a minimalistic terminal program for communicating with devices over \
a serial connection (e.g. embedded systems, switches, modems). It features \
connection via RS232 serial interfaces (including setting of transfer rates) as \
well as in 'Telnet mode' as specified in [RFC 2217]. \
 \
[RFC 2217]: https://tools.ietf.org/html/rfc2217"
LICENSE = "GPL-2.0-only"

PV = "2019.01.0.11"

RPM_NAME = "microcom-2019.01.0.11-1.3.aarch64.rpm"
RPM_HASH = "4983b1a957bd2489661e0baa17a8107d045f3319231c9b2a60b404adcadd23ceb9a76bb252cf10143319f60023403daa2c6377cb94d92f52b30976c9b48e535a"

RPROVIDES:${PN} += "microcom"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libreadline.so.8"

inherit rpm
