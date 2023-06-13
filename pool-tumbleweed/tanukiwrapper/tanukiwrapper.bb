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

RPM_NAME = "tanukiwrapper-3.5.35-2.6.aarch64.rpm"
RPM_HASH = "316af65e5238b83f647dafcf2aa32e894594f83b5af53734bb265ad1a71a533f50b6d11420749ed9c82a7804b250868cef9f395479f1a7868ea9c501b04e0e2d"

RPROVIDES:${PN} += "libwrapper.so()(64bit) \
tanukiwrapper \
tanukiwrapper(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit)"

inherit rpm
