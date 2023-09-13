SUMMARY = "ALSA Topology Library"
DESCRIPTION = "This package contains the library for ALSA topology support."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.10"

RPM_NAME = "libatopology2-1.2.10-1.1.aarch64.rpm"
RPM_HASH = "a122478c358002ad588e5da88c6c12eba445092f0ed796d808fcbf831aed0dbbd51501cc43208ef883d768ef7c0c39c7689fe5528bed23b29da5651ae3be4355"

RPROVIDES:${PN} += "libatopology.so.2 \
libatopology2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6"

inherit rpm
