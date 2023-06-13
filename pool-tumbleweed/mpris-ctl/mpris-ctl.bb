SUMMARY = "Basic mpris player control for linux command line"
DESCRIPTION = "Minimalistic cli tool for controlling audio players exposing a MPRIS \
DBus interface, targeted at keyboard based WMs."
LICENSE = "MIT"

PV = "0.8.5"

RPM_NAME = "mpris-ctl-0.8.5-1.2.aarch64.rpm"
RPM_HASH = "111fe6efcc9dc2641eac11d6f8aecca8b115c5031b9d78523cac39b76a1f817411f70c49361f7393a2f6525b527cdb970daa9cbc92d75b0ada3615bbf3c27ffa"

RPROVIDES:${PN} += "mpris-ctl \
mpris-ctl(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit)"

inherit rpm
