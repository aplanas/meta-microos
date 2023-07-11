SUMMARY = "Java Service Wrapper"
DESCRIPTION = "The Java Service Wrapper is an application which has \
evolved out of a desire to solve a number of problems \
common to many Java applications: \
- Run as a Windows Service or Unix Daemon \
- Application Reliability \
- Standard, Out of the Box Scripting \
- On Demand Restarts \
- Flexible Configuration \
- Ease Application installations \
- Logging"
LICENSE = "GPL-2.0-only"

PV = "3.5.35"

RPM_NAME = "tanukiwrapper-3.5.35-2.7.aarch64.rpm"
RPM_HASH = "40d25bc64e60ab70adca44ee0144b9a0b3d333791c7a6c8289012c0308095520ba92840158636b2baa2e23540896146994d89474271cf31a6abf54023e4cf9c2"

RPROVIDES:${PN} += "libwrapper.so \
tanukiwrapper"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
