SUMMARY = "Shared library part of libmodplug"
DESCRIPTION = "Modplug library based on the ModPlug sound engine. \
- plays 22 different mod formats. \
- plays zip, rar, gzip, and bzip2 compressed mods. \
- plays timidity's GUS patch files (*.pat). \
- plays all types of MIDI files (*.mid). \
- plays textfiles written in the ABC music notation (*.abc)."
LICENSE = "SUSE-Public-Domain"

PV = "0.8.9.0+git20170610.f6dd59a"

RPM_NAME = "libmodplug1-0.8.9.0+git20170610.f6dd59a-2.9.aarch64.rpm"
RPM_HASH = "137e5da2284d5a7988e70b3d564112e1ce60f17495ee82704c5b8c6b938fe29a2b07365ac358f73e13ac992c716835e613bbae02c26c5c7699ae39d2265ed6d4"

RPROVIDES:${PN} += "libmodplug.so.1 \
libmodplug1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
