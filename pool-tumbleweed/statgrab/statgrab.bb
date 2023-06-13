SUMMARY = "Portable System Statistics Tools"
DESCRIPTION = "This package includes a couple of useful tools that use the libstatgrab library. \
- statgrab: gives a sysctl-style interface to the statistics gathered by libstatgrab \
This extends the use of libstatgrab to people writing scripts or anything else \
that can't easily make C function calls. \
Included with this package is a script to generate an MRTG configuration file \
to use statgrab."
LICENSE = "GPL-2.0-or-later"

PV = "0.92.1"

RPM_NAME = "statgrab-0.92.1-1.6.aarch64.rpm"
RPM_HASH = "5410679f1648001b041581cdaa4ba2b0c93e6ea7bd5db2129d8b7a5b120875cd3c3cee37c57b5387107061a057ecb4248077291df714c98e188682928942d620"

RPROVIDES:${PN} += "application() \
application(statgrab.desktop) \
statgrab \
statgrab(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libstatgrab.so.10()(64bit) \
libstatgrab10"

inherit rpm
