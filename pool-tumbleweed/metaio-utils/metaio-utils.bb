SUMMARY = "Command line tools for libmetaio"
DESCRIPTION = "This package contains command-line utilities such as lwtprint to be used with libmetaio."
LICENSE = "GPL-2.0-only"

PV = "8.5.1"

RPM_NAME = "metaio-utils-8.5.1-1.8.aarch64.rpm"
RPM_HASH = "53c9076043147f027b6ca8bab920f6b830c344b1d2fd86247da9605269e2917f92953b34fca8f90a4eb5e5b3b3f4b1f8c59f58a14882a03d3adebea4546b6d61"

RPROVIDES:${PN} += "metaio-utils \
metaio-utils(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libmetaio.so.1()(64bit)"

inherit rpm
