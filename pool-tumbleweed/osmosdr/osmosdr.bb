SUMMARY = "SDR (Software Defined Radio) project"
DESCRIPTION = "OsmoSDR is a software-based small form factor Software Defined Radio project."
LICENSE = "GPL-3.0"

PV = "0.1+git.20151211"

RPM_NAME = "osmosdr-0.1+git.20151211-1.24.aarch64.rpm"
RPM_HASH = "878ef2ebcbe38d494cdc5ba855dd3fb8397b29eb8aa3869b33f55f8806bc973525564cf9e0ec264687e6d3ed4ed6068914ec6af2c6c40e16c2829619c8d0fe49"

RPROVIDES:${PN} += "osmosdr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-1.0.so.0"

inherit rpm
