SUMMARY = "A tool for transmitting and receiving OOK-modulated data with SDRs"
DESCRIPTION = "OOKiedokie is a tool intended to help SDR users interface with miscellaneous \
wireless devices utilizing On-Off Keying, a very simple form of \
Amplitude Shift Keying modulation."
LICENSE = "MIT"

PV = "0.0.0+git.20151230"

RPM_NAME = "OOKiedokie-0.0.0+git.20151230-3.15.aarch64.rpm"
RPM_HASH = "81ad39056143f68ce01990c9f70d939a510c568fce9dfaf14fb13e93f1b653e3cdd53044503ea973e6db311d70a9453a972665f2a141cde9475facf23101ad46"

RPROVIDES:${PN} += "OOKiedokie"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbladeRF.so.2 \
libc.so.6 \
libjansson.so.4"

inherit rpm
