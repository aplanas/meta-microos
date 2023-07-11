SUMMARY = "Influx data language"
DESCRIPTION = "Flux is a lightweight scripting language for querying databases (like InfluxDB) \
and working with data. It is part of InfluxDB 1.7 and 2.0, but can be run \
independently of those. This repository contains the language definition and an \
implementation of the language core."
LICENSE = "MIT"

PV = "0.193.0"

RPM_NAME = "libflux0_193_0-0.193.0-1.2.aarch64.rpm"
RPM_HASH = "941fd9025eac089f256c5106273bbb345002931b1ed170469fa22477991ad00d9c573c8764e4da56ade26bd57c76056b8aa1264132e6ad7a934290b17c71ba5c"

RPROVIDES:${PN} += "libflux \
libflux.so.0.193.0 \
libflux0-193-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1"

inherit rpm
