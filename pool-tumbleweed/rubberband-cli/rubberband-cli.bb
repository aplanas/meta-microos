SUMMARY = "Command line interface for librubberband"
DESCRIPTION = "Package rubberband-cli contains a command-line utility that can be used to exploit \
Rubber Band's capabilities."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.0"

RPM_NAME = "rubberband-cli-3.1.0-1.3.aarch64.rpm"
RPM_HASH = "cc2b67cd7854c16fc8f92594ac2d32bd7ee51b9f33aa26ae97989b797dd74e1d685b37e3107c7db115aca8a6836e28095220331026b794faa4f43788cb6884cf"

RPROVIDES:${PN} += "rubberband-cli"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3.so.3 \
libgcc-s.so.1 \
libm.so.6 \
librubberband2 \
libsndfile.so.1 \
libstdc++.so.6"

inherit rpm
