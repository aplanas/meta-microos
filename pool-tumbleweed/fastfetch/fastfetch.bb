SUMMARY = "Neofetch-like tool written in C"
DESCRIPTION = "Fastfetch is a neofetch-like tool for fetching system information and displaying them in a pretty way. \
It is written in pure c, with performance and customizability in mind. Currently Linux, Android, FreeBSD, \
MacOS and Windows 7+ are supported."
LICENSE = "MIT"

PV = "1.11.0"

RPM_NAME = "fastfetch-1.11.0-1.1.aarch64.rpm"
RPM_HASH = "bda82e82204e9a9abf7be0c0a8b757d78af6c764f71df0419e582260b5915e58f0a57ec6b0225accc58090570e08e45d1a9d6950674e3c45e9170fdc32dac4b7"

RPROVIDES:${PN} += "fastfetch \
fastfetch(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
