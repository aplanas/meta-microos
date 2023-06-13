SUMMARY = "CLI tools to collect and process netflow data"
DESCRIPTION = "The nfdump tools collect and process netflow data on the command line. \
They are part of the NFSEN project which is explained more detailed at \
http://www.terena.nl/tech/task-forces/tf-csirt/meeting12/nfsen-Haag.pdf"
LICENSE = "BSD-3-Clause"

PV = "1.7.1"

RPM_NAME = "nfdump-1.7.1-1.3.aarch64.rpm"
RPM_HASH = "72c53a2ccf9c583b13601e3e3a8b3de3d894d5a752df9b595dd2d5b390463a6536ca2c4c08a56ad1a89db0c2f69b0e4afeb803cc1b7399d069fac5eefbda9b54"

RPROVIDES:${PN} += "config(nfdump) \
nfdump \
nfdump(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcurl.so.4()(64bit) \
libnfdump-1.7.1.so()(64bit) \
librrd.so.8()(64bit) \
rrdtool"

inherit rpm
