SUMMARY = "Command to read temperature from USB thermometer"
DESCRIPTION = "Read temperature from usbtemp.com USB thermometer and DS9097E compatible 1-wire \
adapter with one DS18B20 digital probe attached through command line interface."
LICENSE = "MIT"

PV = "1.063"

RPM_NAME = "utmp-cli-1.063-1.2.aarch64.rpm"
RPM_HASH = "fa37c630bbe59b984e2c2d093db77fdebffb5d930d8afcf2c071ea0d3f125af719d66bad9b06661cee001cc898492d02b8a22619b889d2b953e52cc197486451"

RPROVIDES:${PN} += "utmp-cli"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
