SUMMARY = "OwnTracks command line interface publisher"
DESCRIPTION = "This is the OwnTracks command line interface publisher, a.k.a. \
ocli, a small utility which connects to gpsd and publishes position \
information in OwnTracks JSON to an MQTT broker in order for \
compatible software to process location data."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.0"

RPM_NAME = "ocli-0.9.0-5.3.aarch64.rpm"
RPM_HASH = "63c153ab00b9b7f3b2b2d0eb7951f113467b44a93cd086ff1b2228dc65e0f41ff0e34778f78378a0f241e43f4fe72619b16984167b17771357605a4557b0a603"

RPROVIDES:${PN} += "ocli \
ocli(aarch-64) \
owntracks-cli-publisher"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgps.so.30()(64bit) \
libmosquitto.so.1()(64bit)"

inherit rpm
