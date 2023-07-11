SUMMARY = "Support programs for MRi2500"
DESCRIPTION = "Programs that controls Mirics MRi2500 based DVB dongle in raw mode, so \
it can be used as a SDR receiver."
LICENSE = "GPL-2.0"

PV = "0.0.0+git.20130608"

RPM_NAME = "mirisdr-0.0.0+git.20130608-1.25.aarch64.rpm"
RPM_HASH = "ac024e0264779dda1a6882a4c4533aac0a29f913fc8434078db5618b15717d80bd9735fffb34ae9593cb04e669a742dde04d67310e51dd7e87f09a59e18277da"

RPROVIDES:${PN} += "mirisdr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-1.0.so.0"

inherit rpm
