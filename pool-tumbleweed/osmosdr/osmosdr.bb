SUMMARY = "SDR (Software Defined Radio) project"
DESCRIPTION = "OsmoSDR is a software-based small form factor Software Defined Radio project."
LICENSE = "GPL-3.0"

PV = "0.1+git.20151211"

RPM_NAME = "osmosdr-0.1+git.20151211-1.25.aarch64.rpm"
RPM_HASH = "66051429ec74d9e7befc99b4c611a30e7712ce7a25435d5557794f308b4b0704a3cd98fcd159eeadb867b1c4a60c31eeb04e76ed5a8384bac960332b8c8b966c"

RPROVIDES:${PN} += "osmosdr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-1.0.so.0"

inherit rpm
