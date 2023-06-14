SUMMARY = "High-level C binding for ZeroMQ"
DESCRIPTION = "CZMQ is a higher-level binding for the ZeroMQ core API. \
This package contains key creation utility zmakecert."
LICENSE = "MPL-2.0"

PV = "4.2.1"

RPM_NAME = "czmq-4.2.1-1.8.aarch64.rpm"
RPM_HASH = "aad4b790076064a6f71374357b0fac30ee5600873295367ec7b789f0ae262fea4b7e211beb81b1903c367d203bb50a116c8366ab8684da8ffefdbfa4c802822d"

RPROVIDES:${PN} += "czmq"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libczmq.so.4"

inherit rpm
